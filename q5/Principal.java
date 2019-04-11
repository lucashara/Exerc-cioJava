package q5;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Auxiliar motorista = new Auxiliar();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de gasolina em litros: ");
		float gas = leitor.nextFloat();
		motorista.setGasolina((float) gas);
		motorista.gerarConta();		
		leitor.close();
	}

}