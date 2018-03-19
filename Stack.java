/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This class is a blueprint for a stack
 *
 ****************************************************************************/

import java.util.ArrayList;

public class Stack<Type> {
	//this is a class that defines a stack
	private ArrayList<Type> list = new ArrayList<Type>();
	
	public void push(Type object) {
		//append an object to the end of the stack
		list.add(object);
	}
	
	public Type getAt(int index) {
		//This method returns the item at the given index
		return list.get(index);
	}
}