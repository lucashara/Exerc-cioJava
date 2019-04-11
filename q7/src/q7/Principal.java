package q7;

public class Principal {
	
	public static void main(String[] args) {
			
		Auxiliar lucas = new Auxiliar("Lucas", 1, 5);
		Auxiliar luan = new Auxiliar("Luan", 5, 8);
		Auxiliar lael = new Auxiliar("Lael", 2, 3);
		Auxiliar doug = new Auxiliar("Doug", 4, 5);
		Auxiliar joao = new Auxiliar("Pedro", 10, 9);
		Auxiliar wesley = new Auxiliar("Wesley", 4, 8);

		lucas.fazerMedia();
		luan.fazerMedia();
		lael.fazerMedia();
		doug.fazerMedia();
		joao.fazerMedia();
		wesley.fazerMedia();
		
		lucas.avalia();
		luan.avalia();
		lael.avalia();
		doug.avalia();
		joao.avalia();
		wesley.avalia();
		
		Auxiliar.informa();
	}
}