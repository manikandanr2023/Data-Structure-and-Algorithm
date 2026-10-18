class Animal{
	void eat() {
		System.out.println("Eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	void sleep() {
		System.out.println("Sleep");
	}}
public class babydog{
public static void main(String args[])
{
	Cat b=new Cat();
	b.eat();

	b.sleep();
}
}
