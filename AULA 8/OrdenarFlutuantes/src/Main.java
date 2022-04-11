
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Programa exemplo para entrada de 3 valores inteiros, " +
				"ordenação e impressão deles ordenados.");
		EntradaLinha entrada = new EntradaLinha();
		OperacaoOrdenar operacao = new OperacaoOrdenar();
		SaidaLinha saida = new SaidaLinha();
		
		Valores v = entrada.entrarDados();
		operacao.ordenar(v);
		saida.imprimir(v);
		
		System.out.println("Fim da execução.");

	}

}
