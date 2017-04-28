package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Pessoa;

public interface PessoaDao {

	public Pessoa inserir(Pessoa pessoa);

}
