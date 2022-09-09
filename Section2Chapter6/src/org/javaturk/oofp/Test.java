package org.javaturk.oofp;

public class Test {

	public static void main(String[] args )throws SalaryPaidOnBankException {
  
        Employee employee = new Employee(15, "Elif", 2018, "Engineer") {
			
        @Override
		public void work() {				
			}
		};
		
		System.out.println(employee.toString());
		
        try {
             double salary = employee.calculateSalary();
             if (salary >= 7000) {
                 throw new SalaryPaidOnBankException("Salary paid on bank exception");
             }else System.out.println();
            } 
        catch (SalaryPaidOnBankException salaryPaidOnBankException) {
                System.out.println(salaryPaidOnBankException.toString());
            } 
        finally {
               
            }

    }
}