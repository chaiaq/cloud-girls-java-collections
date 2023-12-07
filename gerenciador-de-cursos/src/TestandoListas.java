import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			// para cada aula dentro de aulas, faça isso:
			System.out.println("Aula: " + aula);	
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i=0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		aulas.forEach(aula -> {System.out.println("Percorrendo: " + aula);});
		// faz uma ação para cada elemento dentro da lista
		// para cada aula dentro de aulas imprima
		
		aulas.add("Aumentando o conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		// ordena a lista por ordem alfabética
		System.out.println(aulas);
		
		
	}

}
