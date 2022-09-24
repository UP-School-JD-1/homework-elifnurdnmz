package part2chapter9q1;

public class Student implements Comparable<Student> {

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
	
	public Student (int no, String name, int year, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.major = major;
		
	}

	void study ( ) {
		System.out.println("Student study lesson.");
	}
	
	void register ( ) {
		System.out.println("Student is registered.");
	}
	
	String toString (String info) {
		info = "Student: " + name + "(No: " + no + ",Year: " + year + ", Major: " + major + ")";
		return info;
	}

	@Override
	public int compareTo(Student o) {
		if (this.year < o.year) {

			return -1;

		} else if (this.year > o.year) {
			return 1;

		}
		return 0;
	}
}
