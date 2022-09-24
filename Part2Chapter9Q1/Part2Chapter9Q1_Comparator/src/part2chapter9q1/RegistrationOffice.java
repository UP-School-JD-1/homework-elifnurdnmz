package part2chapter9q1;

import java.util.*;
import java.util.Collections;

public class RegistrationOffice {
	
	public static void main(String[] args) {
		RegistrationOffice rOffice = new RegistrationOffice();
        List<Student> students= new ArrayList<>();
        students.add(new PhdStudent(1412, "Elif" , 2016, "Engineering", "Ali", "Production", true));
        students.add(new MasterStudent(232, "Ayça", 2017, "International Trade", "Veli", "e-commerce"));
        students.add(new VocationalStudent(2311, "Ahmet",2015, "Engineering"));
        students.add(new UndergraduateStudent(356, "Fevzi",2022,"Business Management","Engineering"));
        Comparator<Student> st=new StudentsComparator();
        Collections.sort(students,st);

        for (Student s : students) {
			System.out.println("Year: " + s.getYear() + ", Name: " + s.getName() + ", No: " + s.getNo());
		}
		
	}
	
}
