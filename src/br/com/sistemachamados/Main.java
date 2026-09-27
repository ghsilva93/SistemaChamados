package br.com.sistemachamados;

public class Main {

	public static void main(String[] args) {
		
		SistemaChamados sistema = new SistemaChamados();

		Chamado chamado1 = new Chamado(1, "Computador travou", "Aberto");
		

		Chamado chamado2 = new Chamado(2, "Internet caiu", "Aberto");
		
	    sistema.adicionarChamado(chamado1);
	    sistema.adicionarChamado(chamado2);
	    
	    sistema.listarChamados();
	    sistema.atualizarStatus(1,"EM ANDAMENTO");
	    sistema.removerChamado(1);
	    sistema.listarChamados();
	  
		}
		
		
	}


