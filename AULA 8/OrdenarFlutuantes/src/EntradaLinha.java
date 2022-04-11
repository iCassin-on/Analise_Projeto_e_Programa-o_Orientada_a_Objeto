import java.util.Scanner;


public class EntradaLinha {

	Valores entrarDados() {
		Valores v = new Valores();
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor 1/3:");
			v.setV1(sc.nextDouble());

	        System.out.println("Digite o valor 2/3:");
	        v.setV2(sc.nextDouble());
	        
	        System.out.println("Digite o valor 3/3:");
	        v.setV3(sc.nextDouble());
		} catch (Exception e) {
            System.err.println(e.getMessage());
        }
		
		return v;
	}
}
