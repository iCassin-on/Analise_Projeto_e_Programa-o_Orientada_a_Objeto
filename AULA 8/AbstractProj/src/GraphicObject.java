
public abstract class GraphicObject {
	int x, y;
	abstract void draw();
    abstract void resize();
    void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    
    public String toString() {
    	return "X:" + x + " Y:" + y;
    }
}
