package lab4;

import java.util.HashSet;

/**
 * Representação de um Grupo, que deve possuir um nome.
 * 
 * @author Gabriel Menezes Cabral - 119110372
 *
 */
public class Grupo {

	/**
	 * Nome do Grupo.
	 */
	private String nomeDoGrupo;
	
	/**
	 * Um HashSet que representa os alunos do Grupo.
	 */
	public HashSet<Aluno> alunosDoGrupo;

	/**
	 * Constrói um grupo, a partir do nome do grupo. No grupo podem ser adicionados alunos, pelo HashSet: alunosDoGrupo.
	 * 
	 * @param nomeDoGrupo eh o nome do grupo.
	 */
	public Grupo(String nomeDoGrupo) {
		validaEntrada(nomeDoGrupo);
		this.nomeDoGrupo = nomeDoGrupo;
		this.alunosDoGrupo = new HashSet<>();
	}
	
	/**
	 * Valida a entrada quanto ao seu conteudo
	 *
	 * @param entrada entrada a ser avaliada.
	 */
	public validaEntrada(String entrada){
		if(entrada == null){
			throw NullPoiterException("Erro no cadastro do grupo: nome do grupo nao pode ser nulo ou vazio.");
		} else if (entra.equals("")) {
			throw IllegalArgumentException("Erro no cadastro do grupo: nome do grupo nao pode ser nulo ou vazio.");
		}
	}

	/**
	 * Método que adiciona um aluno a um determinado grupo.
	 * 
	 * @param aluno eh o aluno a ser adicionado.
	 */
	public void adicionaAluno(Aluno aluno) {
		if (!alunosDoGrupo.contains(aluno)) {
			alunosDoGrupo.add(aluno);
		}
	}

	/**
	 * Retorna a String que representa o grupo com seus respectivos alunos.
	 * 
	 * @return String que representa o aluno.
	 */
	@Override
	public String toString() {
		String retorno = "\nAlunos do grupo " + this.nomeDoGrupo + ":";
		for (Aluno i : alunosDoGrupo) {
			retorno += "\n* " + i.toString();
		}
		return retorno + System.lineSeparator();
	}
	
	/**
	 * Gera um inteiro que representa o hashCode do grupo mediante o nome do Grupo.
	 * 
	 * @return o inteiro que representa o hashCode do grupo.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDoGrupo == null) ? 0 : nomeDoGrupo.hashCode());
		return result;
	}

	/**
	 * Método Equals que compara um objeto com outro a partir do nome do grupo.
	 * 
	 * @param obj objeto que será comparado.
	 * @return um valor booleano indicando se os objetos são iguais ou não, mediante o nome do grupo.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (nomeDoGrupo == null) {
			if (other.nomeDoGrupo != null)
				return false;
		} else if (!nomeDoGrupo.equals(other.nomeDoGrupo))
			return false;
		return true;
	}

}
