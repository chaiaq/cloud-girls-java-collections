import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		// o HashSet não tem uma ordem definida
		// mas não permite elementos repetidos
		
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Sergio");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		boolean testaMatricula = alunos.contains("Paulo");
		System.out.println(testaMatricula);
		
		System.out.println(alunos.size());
		
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
		
	}

}
