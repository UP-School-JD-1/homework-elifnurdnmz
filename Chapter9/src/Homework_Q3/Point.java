package Homework_Q3;

public class Point {

	private int x;
	private int y;
	private int x1;
	private int y1;
	int i,j;
	
	{
		x = 6;
		y = 8;
		x1 = 8;
		y1 = 10;
		i = 1;
		j = -1;
	}
	
	public void point(int x,int x1, int y, int y1) {
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int setX(int x) {
		return this.x = x;
	}
	
	public int setY(int y) {
		return this.y = y;
	}

	public int merkezeUzaklık() {
		int uzaklık = (int) Math.sqrt((this.x * this.x) + (this.y * this.y));
		return uzaklık;
	}

	public int digerNesneyeUzaklık() {
		int uzaklık = (int)Math.sqrt(Math.pow((this.x-this.x1),2)+ Math.pow((this.y-this.y1),2));
		return uzaklık;
	}

	
	 public String clone (){
	        Point copy = new Point();
	        copy.x = this.x;
	        copy.y = this.y;
	        String s = "Kopya nesnedeki x ve y koordinatları -> x: " + this.x + " y: " + this.y;
	        return s;
	    }
	
	public String move() {
		this.setX(getX() + i);
		this.setY(getY() + j);
		String s = "x: " + this.x + " y: " + this.y;
		return s;
	}
	
	public String koordinat() {
		return ("Point nesnesindeki x ve y koordinatları -> x: " + this.x + " y: " + this.y + "\nPoint nesnesindeki diğer x ve y koordinatları -> x: " +  this.x1 + " y: " + this.y1);	
	}
}	