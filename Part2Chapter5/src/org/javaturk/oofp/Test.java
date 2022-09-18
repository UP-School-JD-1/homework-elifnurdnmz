package org.javaturk.oofp;

public class Test {

	public static void main(String[] args ) {
  
        Employee employee = new Employee(15, "Elif", 2018, "Engineer") {
        	
        @Override
		public void work() {				
			}
		};
		
		System.out.print(employee.toString());
		System.out.println(", Salary: " + employee.calculateSalary());
		
        try {
 			System.out.println("in try block in main()................");
 			getSalary (employee);
            } 
        catch (SalaryPaidOnBankException e) {
			System.out.println("Exception!");
			System.out.println("Message: " + e.getMessage());
        } finally {
        	System.out.println("in finally block in main()............");
        }
		System.out.println("");
	}
        
        public static void getSalary (Employee employee) throws SalaryPaidOnBankException {
        if (employee.calculateSalary() >= 7000)
			throw new SalaryPaidOnBankException("Salary paid on bank exception");
		else {
			System.out.println("Salary does not paid on bank exception");
			}
        }
}