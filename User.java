package com.demo.Atm;

public class User {
	
	    private String userID;
	    private int userPIN;
	    double accountBalance;

	    public User(String userID, int userPIN, double accountBalance) {
	        this.userID = userID;
	        this.userPIN = userPIN;
	        this.accountBalance = accountBalance;
	    }

	    public String getUserID() {
	        return userID;
	    }

	    public int getUserPIN() {
	        return userPIN;
	    }

	    public double getAccountBalance() {
	        return accountBalance;
	    }
	}



