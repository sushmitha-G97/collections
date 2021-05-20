package com.xworkz.arrayList.arrayListMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("gova");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("kiwi");
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		fruits.set(1, "blueberry");
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		System.out.println(fruits.size());
		Collections.sort(fruits);
		for (String str : fruits) {
			System.out.println(str);

		}
		Iterator i = fruits.iterator();
		System.out.println("arraylist elements are:");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
