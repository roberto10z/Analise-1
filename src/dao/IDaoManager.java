package dao;

public interface IDaoManager {

	void iniciar();

	void encerrar();

	void confirmarTransa��o();

	void abortarTransa��o();

	PessoaDao getPessoaDAO();
}
