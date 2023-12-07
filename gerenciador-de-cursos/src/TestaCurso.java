import java.util.List;

public class TestaCurso {

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
		
		
		System.out.println(javaColecoes.getAulas());
		// é o mesmo resultado de javaColecoes e aulas porque
		// são referencias ao mesmo objeto
		
		System.out.println(aulas == javaColecoes.getAulas());
		
		
		
	}

}
