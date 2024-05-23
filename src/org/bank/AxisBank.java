package org.bank;

public class AxisBank extends BankInfo {
	
    public void deposit() {
    	System.out.println("600000");
    }
    public void fixed() {
    	System.out.println("10%");
    	
    }
    public void deposits() {
System.out.println("7");
	}
        public static void main(String[] args) {
        	BankInfo a = new AxisBank();
		a.deposit();
		a.fixed();
		a.saving();
		
		}
}
