package com.nt.beans;


import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements ICourseMaterial {

	public JavaCourseMaterial() {
	System.out.println("JavaCourseMaterial::0-param constructor");
 }

	@Override 
	public String courseContent() {
    System.out.println("JavaCourseMaterial.courseContent");
		return "1.oops,2.EH, 3.collections and  etc..";
}
	@Override
	public double price() {
    System.out.println("JavaCourseMaterial.price()");
	return 400;
	}

}
