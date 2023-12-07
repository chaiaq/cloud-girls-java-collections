import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de objetos", 18);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		// imprime o endereco da aula e não o nome porque
		// ele pega o toString da classe mãe que é objeto
		
		Collections.sort(aulas);
		// inicialmente, não serve para a lista porque não é uma string
		// precisa implementar o metodo comparable na classe Aula
		
		
		System.out.println(aulas);
		
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		// faz a comparação com base no critério escolhido (tempo)
		
		// OU pode ser feito diretamente na lista:
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
	}
}
