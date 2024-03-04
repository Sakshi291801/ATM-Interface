package com.demo.Atm;

public class ATM {
	

	    private User currentUser;

	    public ATM(User user) {
	        this.currentUser = user;
	    }

	    public double checkBalance() {
	        return currentUser.getAccountBalance();
	    }

	    public void withdraw(double amount) {
	        if (amount <= currentUser.getAccountBalance()) {
	            currentUser.accountBalance -= amount;
	            System.out.println("Withdrawn:" + amount);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public void deposit(double amount) {
	        currentUser.accountBalance += amount;
	        System.out.println("Deposited:" + amount);
	    }
	}




