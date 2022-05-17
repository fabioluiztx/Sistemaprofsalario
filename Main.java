import java.util.ArrayList;

import javax.swing.JOptionPane;

//Programa para cadastro e exibição de professores e cálculo de salário
//Autor: Fábio Luiz Teixeira

public class Main {

	public static void main(String[] args) {
		//Declaração de objetos
		Adjunto adj;
		Titular tit;
		
		//Declaração da Arraylist com polimorfismo (Adjunto e Titular herdam Professor)
		ArrayList <Professor>professores = new ArrayList<Professor>();
        
        //Variáveis auxiliares
        String nome, titulacao;
        int tipo;
        double salario, qtdeHoras, soma;
        soma = 0;
        salario = 0;
        		
        do {
        	tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção: \n1- Cadastrar Adjunto \n2- Cadastrar Titular \n3- Mostrar professores cadastrados \n4- Total de salários \n5- Sair "));
        	switch(tipo){
        	
        	case 1:
        		//Cadastrar Adjunto
        		nome = JOptionPane.showInputDialog(null, "Digite o nome do professor adjunto: ");
        		qtdeHoras = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: "));
        		adj = new Adjunto(nome, salario, qtdeHoras);
        		adj.calculaSalario();
        		JOptionPane.showMessageDialog(null, "Professor cadastrado \n\n" + adj.retornaDados());
        		professores.add(adj);
        		break;
        		
        	case 2:
        		//Cadastrar titular
        		nome = JOptionPane.showInputDialog(null, "Digite o nome do professor titular: ");
        		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário: "));
        		titulacao = JOptionPane.showInputDialog(null, "Informe a titulação acadêmica \n(Ensino Superior, Doutorado, Especialização, Mestrado, Pós-Doutorado : ");
        		tit = new Titular(nome, salario, titulacao);
        		tit.calculaSalario();
        		JOptionPane.showMessageDialog(null, "Professor cadastrado \n\n" + tit.retornaDados());
        		professores.add(tit);
        		break;
        		
        	case 3:
        		//Mostrar professores cadastrados
        		for (int i = 0 ; i < professores.size(); i++) {
        				JOptionPane.showMessageDialog(null, "Professor" + (i+1) + "/" + professores.size() + "\n\n" + professores.get(i).retornaDados());     				
        		}
        		
        		break;
        		
        	case 4:
        		//Total de salários
        		for (int i = 0 ; i < professores.size(); i++) {
        			soma += professores.get(i).getSalario();
        		}
        		JOptionPane.showMessageDialog(null, "Total salários dos professores: R$" + soma);
        		soma = 0;
        		break;
        	
        	case 5:
        		JOptionPane.showMessageDialog(null, "Obrigado por utilizar o nosso programa!\n \nDoações voluntárias: \nEnvie um pix para o criador do programa! \nNome: Fábio Luiz Teixeira \nChave (cel): 11958499261 "
        				+ "\n\n\n\nCopyright © 2021 todos os direitos reservados");
        		break;
        		
        	default:
        		JOptionPane.showMessageDialog(null, "ERRO404 - Opção inválida!");
        	}}while(tipo != 5);
        
        		
        		
	}
	
}
