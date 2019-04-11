package q8;

public class Principal {
	public static void main(String[] args) {
		
		Auxiliar lucas = new Auxiliar("Lucas", 10);
		lucas.geraConta();
		Auxiliar paulo = new Auxiliar("Paulo", 5);
		paulo.geraConta();
		Auxiliar.geraLucro();
	}
}