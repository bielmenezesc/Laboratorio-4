package lab4;

/**
 * Representação de um Aluno, todo aluno deve possuir uma matrícula, um nome e um curso.
 * 
 * @author Gabriel Menezes Cabral - 119110372
 *
 */
public class Aluno {
	
	/**
	 * Matrícula do Aluno.
	 */
	private String matricula;
	
	/**
	 * Nome do Aluno.
	 */
	private String nome;
	
	/**
	 * Curso do Aluno.
	 */
	private String curso;
	
	/**
	 * Constrói um aluno, a partir da matrícula, o nome , e o cruso dele.
	 * 
	 * @param matricula eh a matrícula do aluno.
	 * @param nome eh o nome do aluno.
	 * @param curso eh o curso do aluno.
	 */
	public Aluno(String matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	/**
	 * Método get que pega a Matrícula de determinado aluno.
	 * 
	 * @return a matrícula do aluno.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Método get que pega o nome de determinado aluno.
	 * 
	 * @return o nome do aluno.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método get que pega o curso de determinado aluno.
	 * 
	 * @return
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Gera um inteiro que representa o hashCode do aluno mediante sua matrícula.
	 * 
	 * @return o inteiro que representa o hashCode do aluno.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/**
	 * Método Equals que compara um objeto com outro a partir do seu número de Matrícula.
	 * 
	 * @param obj objeto que será comparado.
	 * @return um valor booleano indicando se os objetos são iguais ou não, mediante o número da matrícula.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	/**
	 * Retorna a String que representa o Aluno. A representação segue o
	 * formato “MATRICULA - Nome do Aluno - Curso”.
	 * 
	 * @return String que representa o aluno.
	 */
	@Override
	public String toString() {
		return this.getMatricula() + " - " + this.getNome() + " - " + this.getCurso();
	}
}

	



