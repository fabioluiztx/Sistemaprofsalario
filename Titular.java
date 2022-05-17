
public class Titular extends Professor{
	//atributos
	private String titulacao;
	
	//construtor
	public Titular(String n, double s, String t) {
		super(n, s);
		titulacao = t;
	}
	//métodos de acesso
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String t) {
		titulacao = t;
	}
	
	//métodos
	public String retornaDados() {
		String prof = "Professor Titular \n";
		String texttit = "";
		texttit = texttit + "\nTitulação: " + titulacao;
		//método da super classe + retorno
		return  prof + super.retornaDados() + texttit;
				
	}
	
	public void calculaSalario() {
		setSalario((getSalario()*75/100)+getSalario());
	}
}
