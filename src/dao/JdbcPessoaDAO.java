package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Pessoa;

public class JdbcPessoaDAO implements PessoaDao {

	
	   private Connection conexao;
    public void setConexao (Connection conexao)
    {
        this.conexao = conexao;
    }

    @Override
    public Pessoa inserir(Pessoa pessoa) {
        String sql;
                sql="INSERT INTO Pessoa { "
                    +"nome,"
                    +"telefone,"
                    +"cpf)"
                    +"VALUE(?,?,?)";
        PreparedStatement ps;
        try
        {
            ps=conexao.prepareStatement(sql);
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getTelefone());
            ps.setLong(4, pessoa.getCpf());
            ps.executeQuery();
             return pessoa;
        }catch(Exception ex){
            
        }
		return pessoa;
       
    }
}
