package regraNegocio;
import java.text.SimpleDateFormat;

public class Pessoa {
	private String nome;
	private String rg;
	private String cpf;
	private String sexo;
	private SimpleDateFormat nascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setNascimento(SimpleDateFormat nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
