package com.tnsif.miniproject.GoKart;
import java.util.Scanner;


	
	public class GoShoppingApp {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to GoShopping App!");

	        // Prompt user to choose account type
	        System.out.println("Choose your account type:");
	        System.out.println("1. Prime Account");
	        System.out.println("2. Normal Account");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        // Assign instance of GSShopFactory to ShopFactory reference
	        ShopFactory shopFactory = new GSShopFactory();

	        switch (choice) {
	            case 1:
	                // Instantiate GSPrimeAcc and refer it through reference PrimeAcc
	                PrimeAcc primeAcc = shopFactory.createPrimeAccount();
	                System.out.println("Prime Account created.");
	                // Invoke bookProduct() method for Prime Account
	                primeAcc.bookProduct();
	                break;
	            case 2:
	                // Instantiate GSNormalAcc and refer it through reference NormalAcc
	                NormalAcc normalAcc = shopFactory.createNormalAccount();
	                System.out.println("Normal Account created.");
	                // Invoke bookProduct() method for Normal Account
	                normalAcc.bookProduct();
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	        scanner.close();
	    }
	}


