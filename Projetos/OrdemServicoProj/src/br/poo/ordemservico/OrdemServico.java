package br.poo.ordemservico;

import java.util.List;

public class OrdemServico {

	private int codigo;
	private String data;
	private int prestador;
	private List<Integer> tipoServico;
	private int unidade;
	private float valor;
	private String status;
	private String dataFechamento;
	
	public final int getCodigo() {
		return codigo;
	}
	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public final String getData() {
		return data;
	}
	public final void setData(String data) {
		this.data = data;
	}
	public final int getPrestador() {
		return prestador;
	}
	public final void setPrestador(int prestador) {
		this.prestador = prestador;
	}
	public final List<Integer> getTipoServico() {
		return tipoServico;
	}
	public final void setTipoServico(List<Integer> tipoServico) {
		this.tipoServico = tipoServico;
	}
	public final int getUnidade() {
		return unidade;
	}
	public final void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	public final float getValor() {
		return valor;
	}
	public final void setValor(float valor) {
		this.valor = valor;
	}
	public final String getStatus() {
		return status;
	}
	public final void setStatus(String status) {
		this.status = status;
	}
	public final String getDataFechamento() {
		return dataFechamento;
	}
	public final void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	
}
