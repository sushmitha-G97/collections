package com.xworkz.arrayList.arrayListMethods;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> chocolate = new LinkedList<String>();
		chocolate.add("dairy milk");
		chocolate.add("shorts");
		chocolate.add("kisses");
		chocolate.add("ferro roucher");
		chocolate.add("kit-kat");
		System.out.println(chocolate);

		System.out.println(chocolate.get(2));

		chocolate.set(1, "5 star");
		System.out.println(chocolate);

		chocolate.remove(1);
		System.out.println(chocolate);

		System.out.println(chocolate.size());

		Collections.sort(chocolate);
		for (String str : chocolate) {
			System.out.println(str);

		}
		Iterator i = chocolate.iterator();
		System.out.println("arraylist elements are:");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		chocolate.addFirst("gems");
		System.out.println(chocolate);

		chocolate.addLast("tempations");
		System.out.println(chocolate);

		System.out.println(chocolate.getFirst());

		System.out.println(chocolate.getLast());

		chocolate.removeFirst();
		System.out.println(chocolate);

		chocolate.removeLast();
		System.out.println(chocolate);

	}

}
