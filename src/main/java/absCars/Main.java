package absCars;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.io.File;
public class Main extends Thread{
	 public void run() {
		    System.out.println("This code is running in a thread");
		  }
		

	public static void main(String[] args) {
		
		
	

//		ArrayList<String> cars = new ArrayList<String>();
//		cars.add("Volvo");
//		cars.add("BMW");
//		cars.add("Ford");
//		cars.add("Mazda");
//
//		Collections.sort(cars); // Sort cars
//
//		for (String i : cars) {
//			System.out.println(i);
//		}
//		Collections.sort(cars, Collections.reverseOrder()); // Sort myNumbers
//		for (String i : cars) {
//			System.out.println(i);
//		}
//		ArrayList<String> task = new ArrayList<String>();
//		task.add("Study");
//		task.add("pray");
//		task.add("reading");
//		System.out.println(task);
//		// linckedlists
//
//		HashMap<String, String> capitalCities = new HashMap<String, String>();
//		// Add keys and values (Country, City)
//		capitalCities.put("England", "London");
//		capitalCities.put("Germany", "Berlin");
//		capitalCities.put("Norway", "Oslo");
//		capitalCities.put("USA", "Washington DC");
//		System.out.println(capitalCities);
//		
		
//		Pattern pattern = Pattern.compile("كتاب");
//		Matcher matcher = pattern.matcher("أنا أحب قراءة كتاب جديد.");
//		
//		if (matcher.find()) {
//            System.out.println("تم العثور على كلمة 'كتاب'!");
//        } else {
//            System.out.println("لم يتم العثور على كلمة 'كتاب'.");
//        }
//		Pattern pattern = Pattern.compile("\\d+");
//		Matcher matcher = pattern.matcher("رقم الطلب هو 12345");
//
//		if (matcher.find()) {
//		    System.out.println("تم العثور على رقم: " + matcher.group());
//		}
		File myObj = new File("nn.txt");
		System.out.println(myObj.canRead());

		
	}
	

}
