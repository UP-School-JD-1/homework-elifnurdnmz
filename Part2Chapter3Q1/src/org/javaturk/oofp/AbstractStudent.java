package org.javaturk.oofp;

public abstract class AbstractStudent implements Student{

	private int no;
	private String name;
	private int year;
	private String major;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public AbstractStudent (int no, String name, int year, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.major = major;
		
	}

	public abstract void study ();
	
	public abstract void register ( );
	
	String toString (String info) {
		info = "Student: " + name + "(No: " + no + ",Year: " + year + ", Major: " + major + ")";
		return info;
	}
}
