package q6;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Auxiliar funcionario = new Auxiliar();
		
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Informe seu sal�rio: ");
			float salario = leitor.nextFloat();
			funcionario.setSalario(salario);
		
			System.out.println("Informe o valor da parcela: ");
			float parcela = leitor.nextFloat();
			funcionario.setPrestacao(parcela);
		
		leitor.close();
		
		funcionario.calculaCredito();
	}
}