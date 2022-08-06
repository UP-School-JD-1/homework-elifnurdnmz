package Shapes;

public class Triangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.lefTriangle(10,5);

	}
	
	public void lefTriangle (int row, int column) {
	int i,j;
		for(i=0;i<row;i++) {
			for(j=0;j<Math.round(((i/2))+1);j++) {
			System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}


