package part2chapter9q1;


public class PhdStudent extends GraduateStudent{
	
	boolean qualifyingExamTaken;
	
	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	PhdStudent(int no, String name, int year, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
		super(no, name, year, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	@Override
	void study ( ) {
		System.out.println("Graduate student study lesson.");
	}
	
	@Override
	void register ( ) {
		System.out.println("Graduate student study lesson.");
	}
	
	@Override
	void writeThesis() {
		System.out.println("Graduate student write thesis.");
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("Graduate student meet with advisor");
	}
	
	public void writePaper() {
		System.out.println("Phd Student write paper");
	}

}
