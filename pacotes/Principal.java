package pacotes;

public class Principal {

	public static void main(String[] args) {

		Auxiliar bomFuncionario = new Auxiliar();

		bomFuncionario.setSalario((float) 1700.00);
		bomFuncionario.setAumento((float) 0.05);

		System.out.println("O valor do aumento foi: "
				+ (bomFuncionario.getSalario()*bomFuncionario.getAumento())
				+ " e o salario final é de: "
				+ (bomFuncionario.getSalario() + (bomFuncionario.getSalario()*bomFuncionario.getAumento())));

	}

}