
public class Adjunto extends Professor {
	//atributos
	private double qtdeHoras;
	
	//construtor 
	public Adjunto(String n, double s, double h) {
		super(n, s);
		qtdeHoras = h;
		
	}

	//métodos de acesso get e set
	public double getQtdeHoras() {
		return qtdeHoras;
	}


	public void setQtdeHoras(double h) {
		qtdeHoras = h;
	}

	//métodos
	public String retornaDados() {
		String prof = "Professor Adjunto \n";
		String textadj = "";
		textadj =  textadj + "\nQuantidade de horas: " + qtdeHoras + " horas.";
		//método da super classe + retorno
		return prof + super.retornaDados() + textadj;
	} 
	
	public void calculaSalario() {
		setSalario(51.50f * qtdeHoras);
	}
}
