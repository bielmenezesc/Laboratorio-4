package lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.Aluno;

public class AlunoTest {

	@Test
	public void testaConstrutor() {
		Aluno aluno = new Aluno("119", "Bielzin", "Ciências da Computação");
		assertFalse(aluno == null);
	}
	
	@Test
	public void testaGetMatricula() {
		Aluno aluno = new Aluno("205", "Siquera", "Jornalismo");
		assertEquals("205",aluno.getMatricula());
	}
	
	@Test
	public void testaToString() {
		Aluno aluno = new Aluno("303", "Brunoso", "Direito");		
		assertEquals("303 - Brunoso - Direito", aluno.toString());
	}
	
	@Test
	public void testaEquals() {
		Aluno aluno1 = new Aluno("24", "Michelle Obama", "Design");
		Aluno aluno2 = new Aluno("555", "Thamy Gretchen", "Educação Física");
		Aluno aluno3 = new Aluno("24", "Samurai", "Física");
		Aluno aluno4 = new Aluno("555", "Toalha Podre", "Engenharia de Materiais");
		
		assertFalse(aluno1.equals(aluno2));
		assertFalse(aluno3.equals(aluno4));
		
		assertTrue(aluno1.equals(aluno3));
		assertTrue(aluno2.equals(aluno4));
		
	}
	
	@Test
	public void testaHashCode() {
		Aluno aluno1 = new Aluno("24", "Michelle Obama", "Design");
		Aluno aluno2 = new Aluno("555", "Thamy Gretchen", "Educação Física");
		Aluno aluno3 = new Aluno("24", "Samurai", "Física");
		Aluno aluno4 = new Aluno("555", "Toalha Podre", "Engenharia de Materiais");
		
		assertFalse(aluno1.hashCode() == aluno2.hashCode());
		assertFalse(aluno3.hashCode() == aluno4.hashCode());
		
		assertTrue(aluno1.hashCode() == aluno3.hashCode());
		assertTrue(aluno2.hashCode() == aluno4.hashCode());
	}
	
}

