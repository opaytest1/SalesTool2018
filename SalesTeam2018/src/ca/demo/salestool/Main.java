package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting(){
		System.out.println("HELLO HAPPY SALES PEOPLE");
		System.out.println("THIS APP SHOWS SALES DATA");
		System.out.println("2nd push to git remote");
	}
}
