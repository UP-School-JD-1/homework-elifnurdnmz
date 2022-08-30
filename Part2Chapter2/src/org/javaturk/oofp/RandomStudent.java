package org.javaturk.oofp;

public class RandomStudent {
	public Student getAStudent() {
		Student e = null;
		
		int i = (int) (5 * Math.random());
		
		switch (i) {
		case 0:
			e = new Student(2014070, "Ali", 2014, "Industrial Engineering");
			break;
		case 1:
			e = new Student(2016080, "Veli", 2016, "Data Science");			break;
		case 2:
			e = new Student(2018020, "Ayşe", 2018, "Mechanical Engineering");			break;
		case 3:
			e = new Student(2020532, "Fatma", 2020, "Mathematics");			break;
		case 4:
			e = new Student(2022632, "Zeynep", 2022, "Economics");			break;
		}

		return e;
	}
}
