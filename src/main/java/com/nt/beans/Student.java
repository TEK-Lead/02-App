package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	@Autowired
	@Qualifier("java")
	private ICourseMaterial material;
	public void preparation(String examName) {
		System.out.println();

		String courseContent = material.courseContent();
		double price = material.price();
		System.out.println("preparation is going on  using" + courseContent + " matrrail with price::" + price);
		System.out.println("preparation is completed  for " + examName);
	}

}
