package problemSolving;

import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// String Reversal
		Scanner scanner = new Scanner(System.in);
//		System.out.print("enter a string: ");
//		String input = scanner.nextLine();
//
//		String reversed = "";
//		for (int i = input.length() - 1; i >= 0; i--) {
//			reversed += input.charAt(i);
//		}
//
//		System.out.println("reversed text :" + reversed);
//
//		scanner.close();
		// Checksum

		String string = JOptionPane.showInputDialog("enter a string:");
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			sum += string.charAt(i);
		}
		JOptionPane.showMessageDialog(null, "Checksum is : " + sum);

		// Character Occurrence
		Scanner scannerr = new Scanner(System.in);
		System.out.print(":enter a string: ");
		String text = scanner.nextLine();
		System.out.print("enteer the string you want to know it's occurrence  ");
		char searchChar = scanner.next().charAt(0);
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == searchChar) {
				count++;
			}
		}
		System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");

		scanner.close();
	}

}
