package q4;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {

		Auxiliar assalariado = new Auxiliar();
		Scanner lerSalario = new Scanner(System.in);
		Scanner lerNome = new Scanner(System.in);

		String nome = ".";

		while(!nome.equals("fim")) {

			System.out.println("Informe o nome do funcionário: ");
			nome = lerNome.nextLine();
			assalariado.setNome(nome);

			System.out.println("Informe o salario do funcionário: ");
			float salario = lerSalario.nextFloat();
			assalariado.setSalario((float) salario);

				if (assalariado.getSalario() < 500) {
					System.out.println("O novo salario é de: "
					+ (assalariado.getSalario() + (assalariado.getSalario()*.20)));
				}
				else {
					System.out.println("O ajuste não é necessário.");
				}	
		}
		lerNome.close();
		lerSalario.close();
	}
}	