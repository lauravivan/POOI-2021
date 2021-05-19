
public class Square {
	 private int side;
	 private String color;
	 
	 Square(int sd, String cr){
		 side = sd;
		 color = cr;
	 }
	 
	 public int area() {
		 int result;
		 result = side * side;
		 return result;
	 }
	 
	 public int perimeter() {
		 int perimeter;
		 perimeter = 4 * side;
		 return perimeter;
	 }
	 
	 public void paint(String how) {
		 color = how;
	 }
	 
}
