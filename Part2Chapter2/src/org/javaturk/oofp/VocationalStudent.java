package org.javaturk.oofp;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, String major) {
		super(no, name, year, major);
	}
	
	@Override
	void study ( ) {
		System.out.println("Graduate student study lesson.");
	}
	
	@Override
	void register ( ) {
		System.out.println("Graduate student is registered.");
	}
	
	@Override
	String toString (String info) {
		info = "Vocational Student: " + getName() + "(No: " + getNo() + ",Year: " + getYear() + ", Major: " + getMajor() + ")";
		return info;
	}

}
