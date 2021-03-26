package com.address;

import java.util.Scanner;

public class AddressBook {
	String firstName, lastName, address, city, state, email;
	int zipCode;
	long phoneNumber;

	public void showDetail() {
		System.out.println(firstName + " " + lastName + " " + address + " " + city + " " + state + " " + zipCode + " "
				+ phoneNumber + " " + email);
	}

	public void userDetail() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your firstName");
		firstName = sc.nextLine();

		System.out.println("Enter your lastName");
		lastName = sc.nextLine();

		System.out.println("Enter your address");
		address = sc.nextLine();

		System.out.println("Enter your city");
		city = sc.nextLine();

		System.out.println("Enter your state");
		state = sc.nextLine();

		System.out.println("Enter your email");
		email = sc.nextLine();

		System.out.println("Enter your city zipode");
		zipCode = sc.nextInt();

		System.out.println("Enter your phoneNumber");
		phoneNumber = sc.nextLong();

	}
}
