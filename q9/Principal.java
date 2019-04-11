package q9;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Auxiliar paciente = new Auxiliar();

		paciente.nome = "."; //condição de inicio do programa.
		
		Scanner leitornome = new Scanner(System.in);
		Scanner leitorsexo = new Scanner(System.in);
		Scanner leitorpeso = new Scanner(System.in);
		Scanner leitoridade = new Scanner(System.in);
		Scanner leitoraltura = new Scanner(System.in);
		
		while (!paciente.nome.equals("fim")){	
			
			System.out.println("Informe o nome do paciente: ");
			String nome = leitornome.nextLine();
			paciente.setNome(nome);
			
			if (paciente.getNome().equals("fim")){
				break;
			}
			
			System.out.println("Informe o sexo do paciente: ");
			String sexo = leitorsexo.nextLine();
			paciente.setSexo(sexo);
			
			System.out.println("Informe o peso do paciente: ");
			float peso = leitorpeso.nextFloat();
			paciente.setPeso(peso);

			System.out.println("Informe a idade do paciente: ");
			int idade = leitoridade.nextInt();
			paciente.setIdade(idade);
			
			System.out.println("Informe a altura do paciente: ");
			float altura = leitoraltura.nextFloat();
			paciente.setAltura(altura);
			
			Auxiliar.qtdpacientes++;
			
			if(paciente.getSexo().equals("m")) {
				Auxiliar.mediaidadehomem = Auxiliar.mediaidadehomem + paciente.idade;
			}
			
			if(paciente.getSexo().equals("f")) {
				if(paciente.getAltura() >= 1.60 || paciente.getAltura() <= 1.70) {
					if(paciente.getPeso() > 70) {
						Auxiliar.qtdmulheres++;
					}
				}
			}
			
			if(paciente.getIdade() >= 18 || paciente.getIdade() <= 25) {
				Auxiliar.pessoas++;
			}
			
			if(paciente.getIdade() > Auxiliar.maisvelho) {
				Auxiliar.maisvelho = paciente.getIdade();
				Auxiliar.nomemaisvelho = paciente.getNome();
			}
			
			if(paciente.getSexo().equals("f")) {
				if(paciente.getAltura() < Auxiliar.maisbaixa) {
					Auxiliar.maisbaixa = paciente.getAltura();
					Auxiliar.nomemaisbaixa = paciente.getNome();
				}
			}
			
		}
		leitornome.close();
		leitorsexo.close();
		leitorpeso.close();
		leitoridade.close();
		leitoraltura.close();
		Auxiliar.relatorio();
	}
}