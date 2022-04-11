package br.poo.ordemservico;

public class Prestador {
	private int codigo;
	private String nome;
	private String cpf;
	private String especialidade;
	
	public final int getCodigo() {
		return codigo;
	}
	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final String getCpf() {
		return cpf;
	}
	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public final String getEspecialidade() {
		return especialidade;
	}
	public final void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
