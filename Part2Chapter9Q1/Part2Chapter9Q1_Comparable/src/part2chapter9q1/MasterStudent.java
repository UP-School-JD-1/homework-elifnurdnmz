package part2chapter9q1;


public class MasterStudent extends GraduateStudent{
	
	MasterStudent(int no, String name, int year, String major, String advisor, String thesis) {
		super(no, name, year, major, advisor, thesis);
	}
	
	@Override
	void study ( ) {
		System.out.println("Master student study lesson.");
	}
	
	@Override
	void register ( ) {
		System.out.println("Master student study lesson.");
	}
	
	@Override
	void writeThesis() {
		System.out.println("Master student write thesis.");
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("Master student meet with advisor");
	}

}

