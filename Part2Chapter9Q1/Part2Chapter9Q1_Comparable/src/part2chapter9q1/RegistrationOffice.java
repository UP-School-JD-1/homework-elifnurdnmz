package part2chapter9q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

class RegistrationOffice {
	
	public static void main(String[] args) {
		List<Student> list_student = new ArrayList<Student>();

		list_student.add(new Student(133, "Elif ", 2017, "Engineer"));
		list_student.add(new Student(313, "Ayşe ", 2010, "Law"));
		list_student.add(new Student(352, "Ayça ", 2022,"Social Media"));
		list_student.add(new Student(312, "Ali ", 1998,"International Trade"));

		Collections.sort(list_student);

		for (Student s : list_student) {
			System.out.println("No: " + s.getNo() + ",Name: " + s.getName() + ",Year: " + s.getYear());
		}
		
	}
	
	

}
