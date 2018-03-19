/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program tests the stack class
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//instantiate a stack object and add an integer to it
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		System.out.println("Enter an integer");
		String input = reader.readLine();
		int number = Integer.parseInt(input);
		
		Stack<Integer> stackObject = new Stack<Integer>();
		stackObject.push(number);
		System.out.println(stackObject.getAt(0));
	}
}