import java.util.Date;


public class ItemBase {

	private int id;
	private String nome;
	private String observacao;
	private String estado;
	private Date anoDeLancamento;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(Date anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
}
