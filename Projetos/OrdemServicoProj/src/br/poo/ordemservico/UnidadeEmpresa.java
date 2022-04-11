package br.poo.ordemservico;

public class UnidadeEmpresa {
	private int codigo;
	private String nome;
	private String responsaval;
	private String tipo;

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
	public final String getResponsaval() {
		return responsaval;
	}
	public final void setResponsaval(String responsaval) {
		this.responsaval = responsaval;
	}
	public final String getTipo() {
		return tipo;
	}
	public final void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
