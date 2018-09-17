package lab2;
import java.util.*;

public class AddressBook {
	
	// Fields
	LinkedList<BuddyInfo> addressBook = new LinkedList<BuddyInfo> ();
	
	// Constructor
	private AddressBook() {
	}
	
	private AddressBook(BuddyInfo person) {
		addressBook.add(person);
	}
	
	//Methods
	public void addBuddy(BuddyInfo person) {	
		if (addressBook.contains(person)) {
			throw new IllegalArgumentException("That person already exists in this address book");
		}
		else {
			addressBook.add(person);
		}
	}
	
	public void removeBuddy(BuddyInfo person) {
		if (!addressBook.contains(person)) {
			throw new IllegalArgumentException("That person doesn't exist in this address book");
		}
		else {
			addressBook.remove(person);
		}
	}
	
	public int getSize() {
		return addressBook.size();
	}

	public static void main(String[] args) {
		
		BuddyInfo testPerson1 = new BuddyInfo("Homer", 42, 250.1, true);
		BuddyInfo testPerson2 = new BuddyInfo("Marge", 38, 125.0, true);
		
		AddressBook testBook = new AddressBook(testPerson1);	
		System.out.println("Current size of list is " + testBook.getSize() + " and should be 1");
		System.out.println("Test pass = " + (testBook.getSize() == 1));
		System.out.println("----------------------------------");
		
		testBook.addBuddy(testPerson2);
		System.out.println("Current size of list is " + testBook.getSize() + " and should be 2");
		System.out.println("Test pass = " + (testBook.getSize() == 2));
		System.out.println("----------------------------------");
		
		testBook.removeBuddy(testPerson2);
		System.out.println("Current size of list is " + testBook.getSize() + " and should be 1");
		System.out.println("Test pass = " + (testBook.getSize() == 1));
		System.out.println("----------------------------------");
		
		testBook.removeBuddy(testPerson1);
		System.out.println("Current size of list is " + testBook.getSize() + " and should be 0");
		System.out.println("Test pass = " + (testBook.getSize() == 0));
		System.out.println("----------------------------------");
		
	}
	
}
