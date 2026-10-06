package br.com.sistemachamados;

import java.util.ArrayList;
import java.util.Iterator;

public class SistemaChamados {

	private ArrayList<Chamado> chamados = new ArrayList<>();
	private int proximoId = 1;

	public void adicionarChamado(String descricao) {
		Chamado novoChamado = new Chamado(proximoId, descricao, "Aberto");
		chamados.add(novoChamado);
		proximoId++;
	}

	public void listarChamados() {

		for (Chamado chamado : chamados) {
			System.out.println(chamado);

		}
	}

	public void atualizarStatus(int id, String novoStatus) {

		for (Chamado chamado : chamados) {

			if (chamado.getId() == id) {
				chamado.setStatus(novoStatus);
				System.out.println("Status atualizado");
				return;
			}

		}

		System.out.println("Chamado não encontrado");

	}

	public void removerChamado(int id) {

		Iterator<Chamado> iterator = chamados.iterator();

		while (iterator.hasNext()) {

			Chamado chamado = iterator.next();

			if (chamado.getId() == id) {
				iterator.remove();
				System.out.println("Chamado " +  id  + " removido ");
				return;
			}
			
			System.out.println("Chamado " + id + " não encontrado");
		}

	}

}
