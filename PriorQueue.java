package com.xworkz.arrayList.arrayListMethods;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> num = new PriorityQueue();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println("head:" + num.element());
		System.out.println("head:" + num.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = num.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		num.remove();
		num.poll();
		System.out.println("after removing two elements:");
		Iterator<Integer> itr2 = num.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
