import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	
	private List<Aula> aulas = new LinkedList<Aula>();
	// a Array list faz busca mais rapido pelas listas
	// no entanto quando vamos modificar os objetos
	// ela só empurra os objetos para frente, usando bastante memoria
	// já a linked list consegue modificar mais rapido
	// no entanto para buscar elementos do meio da lista ela
	// será mais lenta
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	/*
	 * public int getTempoTotal() { int tempoTotal = 0; for (Aula aula : aulas) {
	 * tempoTotal += aula.getTempo();
	 * 
	 * }
	 * 
	 * return tempoTotal; }
	 */
	
	// o mesmo get pode ser feito assim:
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("Matrícula não encontrada");
		}
	    return this.matriculaParaAluno.get(numero);
	}
	

	
	
	
}
