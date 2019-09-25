package lab4;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import lab4.ControleAlunos;

public class ControleAlunosTest {
	

	
	@Test
	public void testaConstrutor() {
		ControleAlunos controle2 = new ControleAlunos();
		assertFalse(controle2 == null);
	}
	
	@Test
	public void testaCadastrarAluno() {
		ControleAlunos controle = new ControleAlunos();
		assertTrue(controle.cadastrarAluno("119", "Bielzin", "CC"));
		assertFalse(controle.cadastrarAluno("119", "Fake Bielzin", "Engenharia da Computação"));
		assertTrue(controle.cadastrarAluno("114", "Lívia", "Medicina"));
	}
	
	@Test
	public void testaExibirAluno() {
		ControleAlunos controle = new ControleAlunos();
		controle.cadastrarAluno("159", "Vinicius", "Engenharia de Minas");
		assertEquals(System.lineSeparator() + "159 - Vinicius - Engenharia de Minas" + System.lineSeparator(), controle.exibirAluno("159"));
	}
	
	@Test
	public void testaCadastrarGrupos() {
		ControleAlunos controle = new ControleAlunos();
		assertEquals(controle.cadastrarGrupo("Las Ex de Melqui"), "CADASTRO REALIZADO!\n");
		assertEquals(controle.cadastrarGrupo("Las Ex de Melqui"), "GRUPO JÁ CADASTRADO!\n");
	}
	
	@Test
	public void testaAlocarAluno() {
		ControleAlunos controle = new ControleAlunos();
		controle.cadastrarAluno("116", "Zé", "Geológia");
		controle.cadastrarGrupo("El Frangos");
		
		assertEquals(controle.alocarAluno("116", "El Frangos"), "ALUNO ALOCADO!\n");
		assertEquals(controle.alocarAluno("116", "El Chiquitos"), "Grupo não cadastrado.\n" );
		assertEquals(controle.alocarAluno("119", "El Frangos"), "Aluno não cadastrado.\n" );
	}
	
	@Test
	public void testaImprimirGrupos() {
		ControleAlunos controle = new ControleAlunos();
		controle.cadastrarAluno("159", "Vinicius", "Engenharia de Minas");
		controle.cadastrarAluno("119", "Bielzin", "CC");
		controle.cadastrarGrupo("Amiguitos");
		controle.alocarAluno("159", "Amiguitos");
		controle.alocarAluno("119", "Amiguitos");
		
		assertEquals(controle.imprimirGrupo("Amiguitos"), "\nAlunos do grupo Amiguitos:" + "\n* 159 - Vinicius - Engenharia de Minas" 
		+ "\n* 119 - Bielzin - CC" + System.lineSeparator());
	}
	
	@Test
	public void testaRegistrarEstudiosos() {
		ControleAlunos controle = new ControleAlunos();
		controle.cadastrarAluno("119", "Bielzin", "CC");
		
		assertEquals(controle.registrarEstudiosos("119"), "ALUNO REGISTRADO!\n");
		assertEquals(controle.registrarEstudiosos("159"), "Aluno não cadastrado.\n");
	}
	
	@Test
	public void testaImprimirEstudiosos() {
		ControleAlunos controle = new ControleAlunos();
		controle.cadastrarAluno("119", "Bielzin", "CC");
		controle.registrarEstudiosos("119");
		
		assertEquals(controle.imprimirEstudiosos(), "\nAlunos:" + System.lineSeparator() + "1. 119 - Bielzin - CC" + System.lineSeparator());
	}
	
}

