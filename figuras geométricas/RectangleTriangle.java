
public class RectangleTriangle {
	//os atributos são os tipos
	private int biggerSide;
	private int smallerSide;
	private String color;
	
	//os métodos são as funcionalidades
	RectangleTriangle(int sd1, int sd2, String cr){
		biggerSide = sd1;
		smallerSide = sd2;
		color = cr;
	}
	
	public int area() {
		int result;
		result = biggerSide * smallerSide;
		return result;
	}
	
	public int perimeter() {
		int perimeter;
		perimeter = (biggerSide * 2) + (smallerSide * 2);
		return perimeter;
	}
	
	public void paint(String how) {
		 color = how;
	}
}
