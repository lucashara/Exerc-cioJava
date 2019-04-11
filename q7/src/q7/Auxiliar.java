package q7;

public class Auxiliar {
	public String nome;
	public float nota1;
	public float nota2;
	public float media;
	
	public Auxiliar(String nomeAluno, float primeiranota, float segundanota) {
		nome = nomeAluno;
		nota1 = primeiranota;
		nota2 = segundanota;
	}
	
	public static int aprovado;
	public static int exame;
	public static int reprovado;
	public static float mediaturma;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
		
	public float fazerMedia() {
		System.out.println("A média de " + getNome()
		+ " foi: " + ((getNota1() + getNota2())/2) );
		return Auxiliar.mediaturma = Auxiliar.mediaturma + (media = ((getNota1() + getNota2())/2));
	}
	
	public int avalia() {
		
		if(getMedia() >= 7) {
			System.out.println(getNome() + " foi aprovado.");
			return Auxiliar.aprovado = Auxiliar.aprovado + 1; 
		}
		else if(getMedia() > 3 && getMedia() < 7) {
			System.out.println(getNome() + " vai para o exame.");
			return Auxiliar.exame = Auxiliar.exame + 1;
		}
		else {
			System.out.println(getNome() + " foi reprovado");
			return Auxiliar.reprovado = Auxiliar.reprovado + 1;
		}
	}
	
	public static void informa() {
		System.out.println("A quantidade de alunos aprovados: " + Auxiliar.aprovado);
		System.out.println("A quantidade de alunos em exame: " + Auxiliar.exame);
		System.out.println("A quantidade de alunos reprovados: " + Auxiliar.reprovado);
		System.out.println("A média da turma foi de: " + (Auxiliar.mediaturma/6));
	}

}