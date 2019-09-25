package lab4;

import java.util.Scanner;

public class Menu {

	static Scanner ler = new Scanner(System.in);
	static ControleAlunos controle = new ControleAlunos();

	public static void main(String args[]) {

		do {
			System.out.println("(C)adastrar Aluno");
			System.out.println("(E)xibir Aluno");
			System.out.println("(N)ovo Grupo");
			System.out.println("(A)locar Aluno no Grupo e Imprimir Grupos");
			System.out.println("(R)egistrar Aluno que Respondeu");
			System.out.println("(I)mprimir Alunos que Responderam");
			System.out.println("(O)ra, vamos fechar o programa!");
			System.out.print("Opção> ");

			String opcaoEscolhida = ler.nextLine().toUpperCase();
			
			if (opcaoEscolhida == null) {
				throw new NullPointerException("Operação Nula");
			}
			
			if (opcaoEscolhida.trim().isEmpty()) {
				throw new IllegalArgumentException("Operação Inválida.");
			}

			if (opcaoEscolhida.equals("C")) {
				System.out.print("\nMatrícula: ");
				String matricula = ler.nextLine();
				System.out.print("Nome: ");
				String nome = ler.nextLine();
				System.out.print("Curso: ");
				String curso = ler.nextLine();

				if (controle.cadastrarAluno(matricula, nome, curso)) {
					System.out.println("CADASTRO REALIZADO!\n");
				} else {
					System.out.println("MATRÍCULA JÁ CADASTRADA!\n");
				}

			} else if (opcaoEscolhida.equals("E")) {
				System.out.print("\nMatrícula: ");
				String matricula = ler.nextLine();

				System.out.println(controle.exibirAluno(matricula));

			} else if (opcaoEscolhida.equals("N")) {
				System.out.print("\nGrupo: ");
				String nomeGrupo = ler.nextLine();

				System.out.println(controle.cadastrarGrupo(nomeGrupo));

			} else if (opcaoEscolhida.equals("A")) {
				System.out.print("\n(A)locar Aluno ou (I)mprimir Grupo? ");
				String opcao = ler.nextLine().toUpperCase();
				if (opcao == null) {
					throw new NullPointerException("Operação Nula");
				}
				if (opcao.trim().isEmpty()) {
					throw new IllegalArgumentException("Operação Inválida.");
				}
				
				if (opcao.equals("A")) {
					System.out.print("\nMatricula: ");
					String matricula = ler.nextLine();
					System.out.print("Grupo: ");
					String grupo = ler.nextLine();

					System.out.println(controle.alocarAluno(matricula, grupo));

				} else {
					System.out.print("\nGrupo: ");
					String grupo = ler.nextLine();

					System.out.println(controle.imprimirGrupo(grupo));
				}

			} else if (opcaoEscolhida.equals("R")) {
				System.out.print("\nMatricula: ");
				String matricula = ler.nextLine();

				System.out.println(controle.registrarEstudiosos(matricula));

			} else if (opcaoEscolhida.equals("I")) {
				System.out.println(controle.imprimirEstudiosos());

			} else if (opcaoEscolhida.contentEquals("O")) {
				break;
			}
		} while (true);

	}

}
