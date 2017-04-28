package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoManager implements IDaoManager  {
	Connection conex�o;
    private JdbcPessoaDAO pessoaDAO;
    
    public JdbcDaoManager()
    {
        pessoaDAO = new JdbcPessoaDAO();
    }
    
    
    @Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/Eventos";
            conex�o = DriverManager.getConnection(url, "root", "root");
            conex�o.setAutoCommit(false);
           
        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conex�o.isClosed())
                conex�o.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransa��o() {
       try{
           conex�o.commit();
           
       }catch (SQLException ex){
           
       
           throw new DaoException("ocorreu um erro ao confirmar a transa��o"+ex.getMessage());
   }
    }

    @Override
    public void abortarTransa��o() {
      try{
          conex�o.rollback();
      }catch (SQLException ex){
      
          throw new DaoException("sei la"+ex.getMessage());
      }
    }

    @Override
    public PessoaDao getPessoaDAO() {
       return pessoaDAO;
    }
}
