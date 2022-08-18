public class Reader {
	    String firstName;
	    String lastName;
	    int age;
	    char sex;

	    public Reader(String firstName,String lastName, int age, char sex) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.sex = sex;
	    }


	    public String getFirstName() {
	        return firstName;
	    }
	    
	    public String getLastName() {
	        return lastName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public char getSex() {
	        return sex;
	    }

	    public void setSex(char sex) {
	        this.sex = sex;
	    }

	    public void getInfo() {
	        System.out.println("Reader: " + firstName + " , " + lastName + " , " + age + " , " + sex + "\n");
	    }
}

