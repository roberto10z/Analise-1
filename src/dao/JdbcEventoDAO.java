package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Eventos;
import model.Pessoa;

public class JdbcEventoDAO  implements EventosDao{

	   private Connection conexao;
 public void setConexao (Connection conexao)
 {
     this.conexao = conexao;
 }

	@Override
	public Eventos inserir(Eventos evento) {
		// TODO Auto-generated method stub
	  String sql;
	                sql="INSERT INTO Evento { "
	                    +"TipoEvento,"
	                    +"data,"
	                    +"local)"
	                    +"VALUE(?,?,?)";
	        PreparedStatement ps;
		try {
			ps = conexao.prepareStatement(sql);
			ps.setString(2, evento.getTipoEvento());
			ps.setDate(3, new java.sql.Date(evento.getData().getTime()));
			ps.setString(4, evento.getLocal());
		
		} catch (Exception ex) {

		}
		return evento;
	}
	
}
