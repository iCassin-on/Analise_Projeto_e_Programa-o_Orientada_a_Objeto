import java.util.ArrayList;
import java.util.List;

// Teste de Polimorfismo
public class Main {
	public static void main(String[] args) {
		Execute ex = new Soma();
		System.out.println(ex.execute(10,20));
		ex = new Multiplica();
		System.out.println(ex.execute(10,20));
		
		System.out.println(execute(10, 20, new Multiplica()));
		
		// Polimorfismo Paramétrico
		List<Execute> list = new ArrayList<Execute>();
		list.add(ex);
		
		// Utilização de um polimorfismo por sobrecarga
		Soma ex1 = new SuperSoma();
		System.out.println(execute(10,20, ex1));
		
		// Polimorfismo por Coerção
		double x = 1 + 2.0;
		System.out.println(x);
	}
	
	
	/**
	 * Este código pode somar, multiplicar ...
	 */
	public static double execute(int val1, int val2, Execute ex) {
		return ex.execute(val1, val2);
	}
	
}
