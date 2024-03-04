package com.demo.Atm;

	import java.util.Scanner;

	public class AtmInterface {
	    private static User[] users = {
	        new User("123456", 1234, 1000),
	        new User("987654", 4321, 500),
	        new User("Sakshi",0000,2700),
	        new User("Aadi", 7777, 8000),
	        // Add more users as needed
	    };

	    private static User currentUser;
	    private static ATM atm;

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // User Authentication
	        System.out.println("Welcome to the ATM!");
	        System.out.print("Enter your user ID: ");
	        String userID = scanner.nextLine();
	        System.out.print("Enter your PIN: ");
	        int userPIN = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        if (authenticateUser(userID, userPIN)) {
	            System.out.println("Authentication successful.");
	            atm = new ATM(currentUser);

	            // Main Menu
	            while (true) {
	                System.out.println("\nMain Menu:");
	                System.out.println("1. Check Balance");
	                System.out.println("2. Withdraw Money");
	                System.out.println("3. Deposit Money");
	                System.out.println("4. Exit");
	                System.out.print("Enter your choice: ");
	                int choice = scanner.nextInt();
	                scanner.nextLine(); // Consume newline

	                switch (choice) {
	                    case 1:
	                        System.out.println("Your balance: " + atm.checkBalance());
	                        break;
	                    case 2:
	                        System.out.print("Enter amount to withdraw: ");
	                        double withdrawAmount = scanner.nextDouble();
	                        atm.withdraw(withdrawAmount);
	                        break;
	                    case 3:
	                        System.out.print("Enter amount to deposit: ");
	                        double depositAmount = scanner.nextDouble();
	                        atm.deposit(depositAmount);
	                        break;
	                    case 4:
	                        System.out.println("----------Thank you for using the ATM. Goodbye---....!");
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            }
	        } else {
	            System.out.println("Authentication failed. Please try again later.");
	        }
	    }

	    private static boolean authenticateUser(String userID, int userPIN) {
	        for (User user : users) {
	            if (user.getUserID().equals(userID) && user.getUserPIN() == userPIN) {
	                currentUser = user;
	                return true;
	            }
	        }
	        return false;
	    }
	}

	
	