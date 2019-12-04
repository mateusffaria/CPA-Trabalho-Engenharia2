package regraNegocio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Formulario {
	private int codFormulario;
	private String nomeFormulario;
	private Administracao autor;
	private SimpleDateFormat dataInicio;
	private SimpleDateFormat dataFim;
	private ArrayList<Questao> questionario = new ArrayList<Questao>();
	
	
	
	
	
	
	
	public void setCodFormulario(int codFormulario) {
		this.codFormulario = codFormulario;
	}
	public int getCodFormulario() {
		return this.codFormulario;
	}
	public void setNomeFormulario(String nomeFormulario) {
		this.nomeFormulario = nomeFormulario;
	}
	public String getNomeFormulario() {
		return this.nomeFormulario;
	}
	public void setDataInicio(SimpleDateFormat dataInicio) {
		this.dataInicio = dataInicio;
	}
	public void setDataFim(SimpleDateFormat dataFim) {
		this.dataFim = dataFim;
	}
}
