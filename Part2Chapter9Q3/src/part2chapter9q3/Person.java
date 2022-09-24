package part2chapter9q3;

import java.util.ArrayList;

public class Person implements Comparable<Person>  {
	private final String firstName;
	private final String lastName;
	protected ArrayList<String> addresses;
	protected ArrayList<String> phones;
	
	public Person(String firstName, String lastName, ArrayList<String> addresses, ArrayList<String> phones) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.addresses = addresses;
		this.phones = phones;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public ArrayList<String> getAddresses() {
	    return addresses;
	}

	public ArrayList<String> getPhones() {
		return phones;
	}

	@Override
    public int hashCode() {
        return getLastName().hashCode();
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
			
		Person person = (Person) obj;
		if (getLastName().equals(person.getLastName())) {
			return getLastName().equals(person.getLastName());
		}
		return false;
	}

	@Override
	public int compareTo(Person o) {
		 if (getLastName().equals(o.getLastName()) && getFirstName().equals(o.getFirstName())) {
			 return 0;
		 } else  { 
			 return getLastName().compareTo(o.getLastName());
		 }
	}
	
	 @Override
	    public String toString() {
	        return firstName + " " + lastName + " " + addresses.toString() + " " + phones.toString();
	    }

}
