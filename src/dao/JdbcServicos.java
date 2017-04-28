package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Pessoa;
import model.Servicos;

public class JdbcServicos implements ServicosDao{
	 private Connection conexao;
	    public void setConexao (Connection conexao)
	    {
	        this.conexao = conexao;
	    }
	@Override
	public Servicos inserir(Servicos servicos) {
		// TODO Auto-generated method stub
	
	  String sql;
	                sql="INSERT INTO Servico { "
	                    +"valor,"
	                    +"data,"
	                    +"descricao)"
	                    +"VALUE(?,?,?)";
	        PreparedStatement ps;
	        try
	        {
	        	ps = conexao.prepareStatement(sql);
				ps.setDouble(2,servicos.getValor() );
				ps.setDate(3, new java.sql.Date(servicos.getData().getTime()));
				ps.setString(4, servicos.getDescricacao());
	            ps.executeQuery();
	             return servicos;
	        }catch(Exception ex){
	            
	        }
			return servicos;
	       
	    }
	
}
