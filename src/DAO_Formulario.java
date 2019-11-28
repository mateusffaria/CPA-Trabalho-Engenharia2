import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class DAO_Formulario {

	
	Administracao a = new Administracao();
	boolean admin = a.isAdmin();
	private static int num = 1;
	private String texto;
	private boolean obrigatorio;
	private int tipo;
	private String nome;
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTexto() {
		return this.texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isObrigatorio() {
		return obrigatorio;
	}
	public void setObrigatorio(boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void criarForm(Administracao autor) {
		if(admin) {
			setNome(nome);
			DAO_Pergunta DP = new DAO_Pergunta();
			
			setObrigatorio(obrigatorio);
			setTexto(texto);
			setTipo(tipo);
			DP.criarPergunta(num, texto, tipo, obrigatorio);
			num++;
			
		}else {
			JOptionPane.showMessageDialog(null, "Não é Administrador");
		}
	}
	
	public void editarForm(Formulario codFormulario) {
		if(admin) {
			Formulario f = new Formulario();
			
				
			
		}
	}
	
	public void desativarForm(Formulario codFormulario) {
		
	}
	public void definirDataInicioFim(SimpleDateFormat dataInicio, SimpleDateFormat dataFim) {
		
	}
}
