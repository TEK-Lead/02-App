package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dotNet")
@Primary
public class DotNetCourseMaterial implements ICourseMaterial {

	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial::0-param constructor");
	}
		
	@Override
	public String courseContent() {
		System.out.println("VDotnetCourseMaterial.courseContent");
		return "1.c#,2.oops, 3.EH  collection and  etc..";

		
	}

	@Override
	public double price() {
			System.out.println("JavaCourseMaterial.price()");
		return 400;

	}

}
