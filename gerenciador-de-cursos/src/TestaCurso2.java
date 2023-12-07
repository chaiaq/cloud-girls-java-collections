import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso ("Dominando as coleções do Java", 
				"Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		/*
		 * aulas.add(new Aula("Trabalhando com ArrayList", 21));
		 * System.out.println(aulas);
		 */
		
		
		// usando metodo para adicionar aulas:
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 22));
		
		System.out.println(aulas);
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas1 = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas1);
		System.out.println(aulas1);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
		
	}

}
