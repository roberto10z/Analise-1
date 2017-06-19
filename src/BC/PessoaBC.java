package BC;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PessoaBC {
	 
	 	private  long id;
	 	private Long id;
	  	private String nome;
	  	private String email;
	  	private String telefone;
	  	private Date dataNascimento;
	  	private String usuario;
	  	private String senha;
	  	private Endereco endereco;
	  	private List<Venda> vendas;
	 	
	 	
	 	public Pessoa(Endereco endereco) { 
	 
	 	public Pessoa(Endereco endereco){
	  		this.endereco = endereco;
	  		this.vendas = new ArrayList<Venda>();
	  	}
	 	
	  	public List<Venda> getVendas() {
	  		return vendas;
	  	}
	 	
	  	public void setVendas(List<Venda> vendas) {
	  		this.vendas = vendas;
	  	}
	 	
	 	public long getId() {
	 
	 	public Long getId() {
	  		return id;
	  	}
	 	public void setId(long id) {
	 	public void setId(Long id) {
	  		this.id = id;
	  	}
	  	public String getNome() {
	  		return nome;
	  	}
	  	public void setNome(String nome) {
	  		this.nome = nome;
	  	}
	  	public String getEmail() {
	  		return email;
	  	}
	  	public void setEmail(String email) {
	  		this.email = email;
	  	}
	  	public String getTelefone() {
	  		return telefone;
	  	}
	  	public void setTelefone(String telefone) {
	  		this.telefone = telefone;
	  	}
	  	public Date getDataNascimento() {
	  		return dataNascimento;
	  	}
	  	public void setDataNascimento(Date dataNascimento) {
	  		this.dataNascimento = dataNascimento;
	  	}
	 	public Endereco getEndereco() {
	 		return endereco;
	 	}
	 
	 	public void setEndereco(Endereco endereco) {
	 		this.endereco = endereco;
	 	}
	 
	  	public String getUsuario() {
	  		return usuario;
	  	}
	  	public void setUsuario(String usuario) {
	  		this.usuario = usuario;
	  	}
	  	public String getSenha() {
	  		return senha;
	  	}
	  	public void setSenha(String senha) {
	  		this.senha = senha;
	  	}
	 	public Endereco getEndereco() {
			return endereco;
	 	}
	 	public void setEndereco(Endereco endereco) {
	 		this.endereco = endereco;
	 		
	 	}
	 	
	  	
	  
}
