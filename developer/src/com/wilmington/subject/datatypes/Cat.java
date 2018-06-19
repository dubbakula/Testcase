package com.wilmington.subject.datatypes;


public class Cat extends Dog {
		public void speak() {
			System.out.println("meowing");
}
	public static void main(String args[])
	{
		
		Animal a = new Animal();
		a.speak();
		Animal c = new Cat();
		c.speak();
		Animal b = new Dog();
		b.speak();
		

	}

}
