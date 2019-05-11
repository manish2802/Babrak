package com.asthvinayak.method;

public class MethodDemo {

	// with parameter plus return value
	double add(double a, double b) { // a=10,b=20  //call by value
		double c = a + b; // 30
		return c;
	}

	/// with pramiter no return value because of void
	void add1(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	///// no pramiter and no return type
	void add3() {
		System.out.println("add3");
	}

	//// String return type //// argument name lastname
	String fullName(String name, String lastName) { // static  //call by refernce
		System.out.println(" name  +  lastname ");
		return "Hi " + "This is " + name + " " + lastName;

	}

	 int[] deposit2(int[] i) {
		return i;

	}

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();
		System.out.println(m.add(20.768, 10.789));

		System.out.println(m.fullName("abc", "cd"));
		System.out.println(m.fullName("Manish", "Verma"));
		System.out.println(m.fullName("Babark", "hamid"));
		
		MethodDemo m2 = new MethodDemo();
		MethodDemo m3 = new MethodDemo();

	}

}
