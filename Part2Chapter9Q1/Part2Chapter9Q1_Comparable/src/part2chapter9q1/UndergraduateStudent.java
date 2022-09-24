package part2chapter9q1;

public class UndergraduateStudent extends Student {
	
	private String minor;
	
	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public UndergraduateStudent(int no, String name, int year, String major, String minor) {
		super(no, name, year, major);
		this.minor = minor;
	}
	
	@Override
	void study ( ) {
		System.out.println("Undergraduate student study lesson.");
	}
	
	@Override
	void register ( ) {
		System.out.println("Undergraduate student is registered.");
	}
	
	@Override
	String toString (String info) {
		info = "Vocational Student: " + getName() + "(No: " + getNo() + ",Year: " + getYear() + ", Major: " + getMajor() + ")";
		return info;
	}
}

