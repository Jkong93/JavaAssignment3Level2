package assignment3;

/**
 * File name: CarBrandsList.java
 * Author: Jesse Kong, 041056077
 * Course: CST8284-300 – OOP
 * Assignment: 3
 * Date: Dec. 4, 2022
 * Professor: Daniel Cormier
 * Purpose: to demonstrate collection methods and lists, linkedlists, etc. by importing the necessary APIs and outputting those lists
 * and collections in methods required.
 */
//22F Assignment 3: CarBrandsList.java 

// Insert your solution code into this file as instructed in the information document (please read before you start). Hints have been provided on your tasks.

// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are codes inbetween the print statements (see assignment information).

//TO DO: YOUR TASK 1: Add the necessary import statements here.
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;
/**
 * class to demonstrate lists, LinkedLists and Collections to output a string array in various methods
 * @author jessekong
 *
 */
public class CarBrandsList {
	/**
	 * Main method
	 * @param args
	 */
public static void main(String[] args) {
   // add rides to list1
   String[] rides = {"cadillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedes", "keke"};
   // creating LinkedList list1
   LinkedList<String> list1 = new LinkedList<>();

   
   
   // TO DO: YOUR TASK 2

   // add rides2 to list2
   String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cadillac", "toyota", "honda"};
   // creating LinkedList list2
   LinkedList<String> list2 = new LinkedList<>();
   
   
   // TO DO: YOUR TASK 3
   // adding the string array content into collection to be utilized in new LinkedList constructors
   Collection <String> collection1 = Arrays.asList(rides);
   Collection <String> collection2 = Arrays.asList(rides2);
   // HINT: In the section below you should insert code for method calls in main for each of the sections below.

   // TO DO: YOUR TASK 4
   // takes the collection as argument and can be used to print out the arrays
   list1 = new LinkedList<>(collection1);
   list2 = new LinkedList<>(collection2);
   

   // TO DO: YOUR TASK 5
   // adding list1 and list2 elements together into one list1
   list1.addAll(list2);
   
   // TO DO: YOUR TASK 6
   // method to print the original list array
   printList(list1);
   // TO DO: YOUR TASK 7
   // method to print the original list array in all uppercase letters
   printUpperCaseList(list1);
   
   // TO DO: YOUR TASK 8
   // method to print out the list array with entries deleted from the list array
   printDeletion(list1);
   // method to print out the new updated list array with the changes applied so far 
   printUpdatedList(list1);
   
   // TO DO: YOUR TASK 9
   // method to print out the list array in reverse order
   printReversedList(list1);

   // TO DO: YOUR TASK 10  
   // method to print out the list array in alphabetical order
   printSortedList(list1);

   // TO DO: YOUR TASK 11
   // method to print out the list array with no duplicate elements in the array
   printNonDuplicates(list1);
   
} 



// HINT: MORE TO DO: Insert all your methods in this section which includes: 

 // output List contents
/**
 * method to print current list
 * @param list1
 */
	public static void printList(LinkedList<String> list1) {
	System.out.println("List is: \n" + list1);
}

 // locate String objects and convert to uppercase
	/**
	 * method to print current list in uppercase letters
	 * @param list1
	 */
	public static void printUpperCaseList(LinkedList<String> list1) {
		list1.replaceAll(String::toUpperCase);
		System.out.printf("%nDisplaying names of car brands in uppercase letters...\n");
		System.out.println("List is: \n" + list1);
	}

 // print list with 5 to 7 missing
 // obtain sublist and use clear method to delete sublist items
	/**
	 * method to delete elements 5 through to 7 in the array and print it out using subList and clear
	 * @param list1
	 */
	public static void printDeletion(LinkedList<String> list1) {
		list1.subList(5, 8).clear();
		System.out.printf("%nDeleting car brands 5 to 7...\n");
		System.out.println("List is: \n" + list1);
	}
	
	// print updated list with the elements 5 to 7 missing
	/**
	 * method for printing out the updated list with all changes so far
	 * @param list1
	 */
	public static void printUpdatedList(LinkedList<String> list1) {
		System.out.printf("%nHere is the current list of car brands...\n");
		System.out.println("List is: \n" + list1);
		}

 // print the list in reverse order
	/**
	 * method to print out the list in reverse order using Collections.reverse method 
	 * @param list1
	 */
	public static void printReversedList(LinkedList<String> list1) {
		Collections.reverse(list1);
		System.out.printf("%nReversed list: \n");
		System.out.println(list1);
	}
	
	 // print out current list that has been sorted alphabetically
	/**
	 * method to print out the list in alphabetical order using the method Collections.sort
	 * @param list1
	 */
		public static void printSortedList(LinkedList<String> list1) {
			Collections.sort(list1);
			System.out.printf("%nSorted car brands in alphabetical order...\n");
			System.out.println("List is: \n" + list1);
		}
		 //locate String objects and eliminate duplicates
		 /**
		  * method to print out the list with no duplicate elements in the array using Set method which 
		  * does not allow for duplicates and also the LinkedHashSet which will allow the list to 
		  * keep its current order.
		  * clear deletes all the elements in list1 and gets added back in the order that it was by addAll
		  * @param list1
		  */
		public static void printNonDuplicates(LinkedList<String> list1) {
			Set<String> set = new LinkedHashSet<>(list1);
			list1.clear();
			list1.addAll(set);
			System.out.printf("%nRemoving duplicate car brands...\n");
			System.out.println("Non duplicates are: " + list1);
		}

}