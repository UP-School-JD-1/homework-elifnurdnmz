package Shapes;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.drawFilledRectangle(10,5);
		System.out.println();
		r.drawVoidRectangle(10,5);
	}
	
	public void drawFilledRectangle (int row, int column) {
		int i,j;
		for (i=0; i<row; i++) {
			for (j=0; j<column; j++) {
			System.out.print("*");
			if (j == column -1)
				System.out.println(" ");
			}
		}
	}
	
	public void drawVoidRectangle (int row, int column) {
		int i,j;
		for (i=0; i<row; i++) {
			for (j=0; j<column; j++) {
				if (i==0 | i==row-1) {
					System.out.print("*");
				}
				else {
					if (j==0 | j==column-1) 
					System.out.print("*");	
					else
					System.out.print(" ");
				}				
			}
			System.out.println(" ");
		}
	}
}