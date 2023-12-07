

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso ("Dominando as coleções do Java", 
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Torini", 369854);
		Aluno a2 = new Aluno("Guilherme Silveira", 321458);
		Aluno a3 = new Aluno("José Antunes", 417478);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		
		System.out.println("Todos os alunos do curso: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
	}

}
