package br.poo.ordemservico;

import java.util.List;
import java.util.Scanner;

public class PrestadorMenu {

	public void menu(Scanner sc) {
		while(true) {
			System.out.println("Cadastro de Prestador de Serviço");
			System.out.println("1 - Listar");
			System.out.println("2 - Incluir");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Voltar");
			String opcao = sc.nextLine();
			if (opcao.equals("1")) {
				listar();
			} else if (opcao.equals("2")) {
				incluir(sc);
			} else if (opcao.equals("3")) {
				atualizar(sc);
			} else if (opcao.equals("4")) {
				excluir(sc);
			} else if (opcao.equals("5")) {
				break;
			} else {
				System.out.println("Op��o n�o conhecida" + opcao);
			}
		}
		
	}

	private void listar() {
		PrestadorDAO dao = new PrestadorDAO();
		List<Prestador> list = dao.getList();
		for (Prestador p : list) {
			System.out.println("Codigo:" + p.getCodigo()
					+ " Nome:" + p.getNome()
					+ " CPF:" + p.getCpf()
					+ " Especialidade:" + p.getEspecialidade());
		}
	}
	
	private void incluir(Scanner sc) {
		System.out.println("Incluir um prestador:");
		System.out.println("C�digo:");
		String codigo = sc.nextLine();
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("CPF:");
		String cpf = sc.nextLine();
		System.out.println("Especialidade:");
		String especialidade = sc.nextLine();
		
		if (codigo == null 
				|| codigo.trim().length() == 0) {
			System.out.println("Código inválido.");
			return;
		}
		if (nome == null 
				|| nome.trim().length() == 0) {
			System.out.println("Nome inválido.");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Código deve ser numérico");
			return;
		}
		
		Prestador p = new Prestador();
		p.setCodigo(cod);
		p.setNome(nome);
		p.setCpf(cpf);
		p.setEspecialidade(especialidade);
		
		PrestadorDAO dao = new PrestadorDAO();
		dao.inserir(p);
	}
	
	private void atualizar(Scanner sc) {
		System.out.println("Atualizar um prestador:");
		System.out.println("Informe o Código:");
		String codigo = sc.nextLine();
		
		if (codigo == null 
				|| codigo.trim().length() == 0) {
			System.out.println("Código inválido.");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Código deve ser numérico");
			return;
		}
		PrestadorDAO dao = new PrestadorDAO();
		Prestador p = dao.getPrestador(cod);
		if (p == null) {
			System.out.println("Prestador não encontrado:" + cod);
			return;
		}

		System.out.println("Nome (" + p.getNome() +"):");
		String nome = sc.nextLine();
		System.out.println("CPF(" + p.getCpf() +"):");
		String cpf = sc.nextLine();
		System.out.println("Especialidade(" + p.getEspecialidade() +"):");
		String especialidade = sc.nextLine();
		p.setNome(nome);
		p.setCpf(cpf);
		p.setEspecialidade(especialidade);
		dao.atualizar(p);
	}

	private void excluir(Scanner sc) {
		System.out.println("Atualizar um prestador:");
		System.out.println("Informe o Código:");
		String codigo = sc.nextLine();
		
		if (codigo == null 
				|| codigo.trim().length() == 0) {
			System.out.println("Código inválido.");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Código deve ser numérico");
			return;
		}
		PrestadorDAO dao = new PrestadorDAO();
		Prestador p = dao.getPrestador(cod);
		if (p == null) {
			System.out.println("Prestador não encontrado:" + cod);
			return;
		}
		dao.excluir(p);
	}


}
