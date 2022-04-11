
public class Linha extends GraphicObject {
	@Override
	void draw() {
		System.out.println("draw");
	}

	@Override
	void resize() {
		System.out.println("resize");
	}
}
