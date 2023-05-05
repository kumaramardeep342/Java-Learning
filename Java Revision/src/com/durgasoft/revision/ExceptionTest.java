package com.durgasoft.revision;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5,b=1,c;
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());	
		}
	}

}
