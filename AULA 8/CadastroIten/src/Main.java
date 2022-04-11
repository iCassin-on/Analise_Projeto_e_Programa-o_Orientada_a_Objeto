import java.util.Date;


public class Main {
	public static void main(String[] args) {
		CDItem cd = new CDItem();
		cd.setId(0);  //Pertence a base;
		cd.setCantor("José e João");
		cd.setNumeroTrilhas(12);
		
		ItemBase dvd = new DVDItem();
		dvd.setId(1);
		((DVDItem)dvd).setAtor("Jorge o Curioso");
		dvd.setEstado("Bom");
		dvd.setAnoDeLancamento(new Date());

		System.out.println("CD (" + cd.getId() + ") :" + cd.getCantor());
		System.out.println("DVD (" + dvd.getId() + ") :" + dvd.getAnoDeLancamento()); 
	}
}
