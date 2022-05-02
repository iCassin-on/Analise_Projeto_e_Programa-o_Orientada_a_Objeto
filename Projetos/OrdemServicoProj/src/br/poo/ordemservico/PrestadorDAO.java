package br.poo.ordemservico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Persistência em Arquivo.
 * @author marco
 */
public class PrestadorDAO {

	/** Nome do arquivo comum a todas as operações. */
	private static final String PRESTADOR_TXT = "Prestador.txt";

	/**
	 * Retorna todos os prestadores em forma de lista.
	 * @return lista.
	 */
	public List<Prestador> getList() {
		List<Prestador> list = new ArrayList<Prestador>();
		try {
			FileReader fr = new FileReader(PRESTADOR_TXT);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] var = line.split(";");
				Prestador p = new Prestador();
				p.setCodigo(Integer.parseInt(var[0]));
				p.setNome(var[1]);
				p.setCpf(var[2]);
				p.setEspecialidade(var[3]);
				list.add(p);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * Retorna um prestador para seu código.
	 * @param cod código.
	 * @return Prestador se existir.
	 */
	public Prestador getPrestador(int cod) {
		List<Prestador> list = getList();
		for (Prestador p : list) {
			if (p.getCodigo() == cod) {
				return p;
			}
		}
		return null;
	}

	
	/**
	 * Insere um prestador.
	 * O arquivo é aberto para leitura, porém, com append=true
	 * para escrever no final do arquivo.
	 * @param p novo prestador.
	 */
	public void inserir(Prestador p) {
		try {
			FileWriter fw = 
					new FileWriter(PRESTADOR_TXT, true);
			String line = getLine(p);
			fw.write(line);
			fw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Método auxiliar para manter o padrão do arquivo.
	 * @param p prestador.
	 * @return linha do banco.
	 */
	private String getLine(Prestador p) {
		String line = p.getCodigo() 
				+ ";" + p.getNome()
				+ ";" + p.getCpf()
				+ ";" + p.getEspecialidade()
				+ "\r\n";
		return line;
	}


	/**
	 * Atualiza um prestador.
	 *
	 * Em arquivo, essa operação complexa, pois não se pode
	 * escrever no meio do arquivo.  O que se faz é escrever
	 * todo o arquivo novamente.
	 *
	 * @param p novo prestador.
	 */
	public void atualizar(Prestador pAtualizar) {
		
		// Recupera todo os prestadores.
		List<Prestador> list = getList();
		
		try {
			// Abrir o arquivo para escrita, reescrevendo tudo.
			FileWriter fw = new FileWriter(PRESTADOR_TXT, false);
			for (Prestador p : list) {
				String line = getLine(p);
				if (p.getCodigo() == pAtualizar.getCodigo()) {
					line = getLine(pAtualizar);
				}
				fw.write(line);
			}
			fw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Excluir um prestador.
	 *
	 * Em arquivo, essa operação complexa, pois não se pode
	 * escrever no meio do arquivo.  O que se faz é escrever
	 * todo o arquivo novamente.
	 *
	 * @param p novo prestador.
	 */
	public void excluir(Prestador pExcluir) {
		
		// Recupera todo os prestadores.
		List<Prestador> list = getList();
		
		try {
			// Abrir o arquivo para escrita, reescrevendo tudo.
			FileWriter fw = new FileWriter(PRESTADOR_TXT, false);
			for (Prestador p : list) {
				String line = getLine(p);
				if (p.getCodigo() == pExcluir.getCodigo()) {
					continue;  // Nada a fazer, somente não escreve no arquivo.
				}
				fw.write(line);
			}
			fw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
