package br.com.sistemachamados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcão = -1;
		
		
		SistemaChamados sistema = new SistemaChamados();


		while (opcão != 0) {
			System.out.println("===MENU SISTEMA===");
			System.out.println("1- ADICINAR CHAMADO");
			System.out.println("2- LISTAR CHAMADOS");
			System.out.println("3- ATUALIZAR STATUS");
			System.out.println("4- REMOVER CHAMADO");
			System.out.println("0- SAIR");

			opcão = sc.nextInt();

			if (opcão == 1) {
				System.out.println("ADICINAR CHAMADO");
				System.out.println("Digite a descrição do chamado");
				sc.nextLine();
				String descricão = sc.nextLine();
				
				sistema.adicionarChamado(descricão);

			}
			if (opcão == 2) {
				System.out.println("LISTAR CHAMADO");
				sistema.listarChamados();
			}

			if (opcão == 3) {
				System.out.println("Digite o ID:");
				int id = sc.nextInt();
				System.out.println("Digite o novo Status:");
				sc.nextLine();
				String status = sc.nextLine();
				sistema.atualizarStatus(id, status);
			}
			
			if (opcão == 4) {
				System.out.println("Digite o ID do chamado que deseja remover");
				int id = sc.nextInt();
				sistema.removerChamado(id);
				
				
			}
		}

	}
}
