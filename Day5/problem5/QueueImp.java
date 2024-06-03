package com.ey.problem5;



import java.util.*;

import com.ey.problem4.Employee;

public class QueueImp {

	public static void main(String[] args) {
		Queue<Object> q= new LinkedList<>();
		q.add(1);
		q.add("Tony");
		q.add(2.3);
		q.add(3.3f);
		q.add(true);
		q.add("Hi welcome");
		System.err.println(q);
		
	}
	
}
