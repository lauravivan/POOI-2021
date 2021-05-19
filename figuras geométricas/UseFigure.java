import javax.swing.JOptionPane;

public class UseFigure {
	//mine, yours, ugly, pretty são referencias
	//supondo que haja 2 quadrados
	//mine = quadrado azul; yours = quadrado amarelo
	//e outro = mine; 
	//haverá três referências, 2 apontando para o mesmo quadrado, pois outro = mine;
	
	//CLASSE = FORMA DE PÃO FRANCÊS (MODELO, FORMA)
	//OBJETO = OS PÃES
	public static void main(String[] args) {
		int number, auxiliar;
		String valueOfEntrance;
		Square mine, yours;
		Rectangle ugly, pretty;
		RectangleTriangle fine, boring;
		
		//SQUARE MINE
		valueOfEntrance = JOptionPane.showInputDialog("Inform the side of square mine");
		number = Integer.parseInt(valueOfEntrance);
		valueOfEntrance = JOptionPane.showInputDialog("Inform the color of square mine");
		mine = new Square(number, valueOfEntrance);
		auxiliar = mine.area();
		System.out.println("Area of mine = " +auxiliar);
		auxiliar = mine.perimeter();
		System.out.println("Perimeter of mine = " +auxiliar);
		
		//SQUARE YOURS
		yours = new Square(5, "yellow");
		System.out.println("Area of yours = " + yours.area());
		System.out.println("Perimeter of yours = " + yours.perimeter());
		
		//RECTANGLE PRETTY
		valueOfEntrance = JOptionPane.showInputDialog("Inform the bigger side of the rectangle pretty");
		number = Integer.parseInt(valueOfEntrance);
		do {valueOfEntrance = JOptionPane.showInputDialog("Inform the smaller side of the rectangle pretty");
			auxiliar = Integer.parseInt(valueOfEntrance);
		}while (auxiliar >= number);
		valueOfEntrance = JOptionPane.showInputDialog("Inform the color of the rectangle pretty");
		pretty = new Rectangle(number, auxiliar, valueOfEntrance);
		auxiliar = pretty.area();
		System.out.println("Area of pretty = " +auxiliar);
		auxiliar = pretty.perimeter();
		System.out.println("Perimeter of pretty = " +auxiliar);
		
		//RECTANGLE UGLY
		ugly = new Rectangle(5, 2, "green");
		auxiliar = ugly.area();
		System.out.println("Area of ugly = " +auxiliar);
		auxiliar = ugly.perimeter();
		System.out.println("Perimeter of ugly = " +auxiliar);
		
		//RECTANGLE TRIANGLE FINE
		valueOfEntrance = JOptionPane.showInputDialog("Inform the side of square mine");
		number = Integer.parseInt(valueOfEntrance);
		valueOfEntrance = JOptionPane.showInputDialog("Inform the color of square mine");
		mine = new Square(number, valueOfEntrance);
		auxiliar = mine.area();
		System.out.println("Area of mine = " +auxiliar);
		auxiliar = mine.perimeter();
		System.out.println("Perimeter of mine = " +auxiliar);
		
		//RECTANGLE TRIANGLE BORING
		boring = new RectangleTriangle(9, "red");
		System.out.println("Area of boring = " + boring.area());
		System.out.println("Perimeter of boring = " + boring.perimeter());
	}

}
