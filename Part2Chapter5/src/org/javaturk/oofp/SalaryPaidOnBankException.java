package org.javaturk.oofp;

public class SalaryPaidOnBankException extends Exception {

    public SalaryPaidOnBankException(String message) {
        super(message);
    }
    
    public String toString () {
    	return "Salary paid on bank exception";
    }
}
