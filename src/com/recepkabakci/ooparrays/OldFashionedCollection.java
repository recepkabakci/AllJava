package com.recepkabakci.ooparrays;

import java.util.LinkedList;

import com.recepkabakci.practise.Person;

public class OldFashionedCollection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(2.5);
		list.add(true);
		list.add(new Person());
		
		for (Object object : list) {
			System.out.println(object);
			if (object instanceof Integer) {
			}
			else if (object instanceof Boolean) {
				if ((Boolean)object) {
					System.out.println("doğru");
				}
				else {
					System.out.println("yanlış");
				}
			}
			else if (object instanceof Person) {
				Person pers = (Person)object;
				pers.age = 20;
			}
		}
	}

}
