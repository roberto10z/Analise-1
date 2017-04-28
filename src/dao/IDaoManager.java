package dao;

public interface IDaoManager {

	void iniciar();

	void encerrar();

	void confirmarTransação();

	void abortarTransação();

	PessoaDao getPessoaDAO();
}
