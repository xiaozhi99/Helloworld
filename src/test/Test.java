package test;

class Car{
	String name;
	String color;
	int wheel;
	public Car(int a,int b,int c){
		System.out.println("dasd"+a);
	}
	public void run(){
		System.out.println(name+"飞起");
	}
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car=new Car(1,1,1);
//		car.name="bmw";
//		car.run();
	}
}
