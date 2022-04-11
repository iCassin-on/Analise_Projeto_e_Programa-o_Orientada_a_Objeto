
public class Main {
	public static void main(String[] args) {
		Linha linha = new Linha();
		linha.moveTo(10,10);
		System.out.println(linha);
		//GraphicObject graphic = new GraphicObject(); erro
		GraphicObject graphic = new Circulo();
	}
}
