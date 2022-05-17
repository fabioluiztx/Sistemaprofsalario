public class Professor {
	//atributos
	private String nome;
	private double salario;

	//construtor
	public Professor (String n, double s) {
		nome = n;
		salario = s;
}

	//métodos de acesso
	public void setSalario(double s) {
		salario = s;

		}

	public double getSalario() {
		return salario;
}

	public void setNome(String n) {
		nome = n;
}

	public String getNome() {
		return nome;
}

	//Método de impressão letra a) do exercício
	public String retornaDados() {
		String text = "";
		text =  text +  "Nome: " + nome + "\nSalário: R$"+ salario ;
		return text;
}
}
