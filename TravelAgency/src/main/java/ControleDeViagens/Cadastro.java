package ControleDeViagens;

public class Cadastro {
	private String nome;
	private String cpf;
	private String sexo;
	private String idade;
	private String telefone;
	private String email;
	private String planoCliente;
	
	
	public Cadastro(String oNome, String oCpf, String oSexo, String aIdade, String oTelefone, String oEmail, String oPlano) {
		this.nome= oNome;
		this.cpf = oCpf;
		this.sexo = oSexo;
		this.idade = aIdade;
		this.telefone = oTelefone;
		this.email = oEmail;
		this.planoCliente = oPlano;
	}
	
	public void impressaoDeDados(Cadastro pessoa) {
		System.out.println("Nome: "+ pessoa.nome);
		System.out.println("CPF: "+ pessoa.cpf);
		System.out.println("Sexo: "+ pessoa.sexo);
		System.out.println("Idade: "+ pessoa.idade);
		System.out.println("Telefone: "+ pessoa.telefone);
		System.out.println("E-mail: "+ pessoa.email);
		System.out.println("Plano do cliente: " + pessoa.planoCliente);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlanoCliente() {
		return planoCliente;
	}
	public void setPlanoCliente(String planoCliente) {
		this.planoCliente = planoCliente;
	}
}
