package q3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int i = 1;
		Auxiliar base = new Auxiliar();

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero para que a tabuada seja exibida: ");

		int num = leitor.nextInt();
		base.setNum(num);
		leitor.close();

		for(; i <=10; i++) {
			System.out.println(base.getNum() + " x " + i
					+ " = " + (base.getNum()*i));
		}
	}

}