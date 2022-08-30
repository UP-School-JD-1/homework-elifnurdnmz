package org.javaturk.oofp;

public class GraduateStudent extends AbstractStudent {
	
	private String advisor;
	private String thesis;

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}	

	GraduateStudent(int no, String name, int year, String major, String advisor, String thesis) {
		super(no, name, year, major);	
		this.advisor = advisor;
		this.thesis = thesis;
	}
	
	@Override
	public void study ( ) {
		System.out.println("Graduate student study lesson.");
	}
	
	@Override
	public void register ( ) {
		System.out.println("Graduate student study lesson.");
	}
	
	void writeThesis() {
		System.out.println("Graduate student write thesis.");
	}
	
	public void meetWithAdvisor() {
		System.out.println("Graduate student meet with advisor");
	}

}
