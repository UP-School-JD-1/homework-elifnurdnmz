package org.javaturk.oofp;

public class RegistrationOffice {
	
	public static void main(String[] args) {
		RegistrationOffice office = new RegistrationOffice();
		RandomStudent student= new RandomStudent();
		Student getStudent = student.getAStudent();
		office.registerStudent(getStudent);
		
	}
	
	 public void registerStudent(Student student) {
		 
		 if (student instanceof PhdStudent) {
			 PhdStudent p =(PhdStudent) student;
			 if(p.qualifyingExamTaken) {
			 System.out.println("Registered Phd student "+ p.getName()+ " has completed successfully.");
			 }
			 else {
				 System.out.println("Registered Phd student " + p.getName()+ " has completed unsuccessfully.");
			 }
		 }
		 
		 	else if(student instanceof GraduateStudent) {
				GraduateStudent g = (GraduateStudent) student;
				System.out.println("Registered graduate student "+ g.getName()+" is graduated.");
				System.out.println("Student's thesis subject is: "+ g.getThesis());
				System.out.println("Student's advisor's name is: "+ g.getAdvisor());
				
			}
			else if(student instanceof VocationalStudent) {
				VocationalStudent v =(VocationalStudent) student;
				System.out.println("Registered vocational student's name is "+ v.getName());
				System.out.println(v.getName()+ " is studying " + v.getMajor());				
			}
			else if(student instanceof UndergraduateStudent) {
				UndergraduateStudent u = (UndergraduateStudent) student;
				System.out.println("Registrated undergraduate student's name is"+ u.getName());
				System.out.println(u.getName()+ " is studying " + u.getMajor());
			}
			else if(student instanceof Student) {
				System.out.println("Registered student's name is " +student.getName());
			}
		 	
	}

}