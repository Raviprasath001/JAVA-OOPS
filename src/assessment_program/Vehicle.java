package assessment_program;

//public class Vehicle {
// static String value1="Executed Successfully";
//	public static void main(String[] args) {
//		System.out.println(value1);
//	}
//}

/*
OBJECT: 

public class Vehicle {
 String value1="Executed Successfully";
	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		System.out.println(obj.value1);
	}
}
*/

//ENCAPSULATION:
/*
public class Vehicle {
	private String value1;
public String getname() {
	return value1;
}
public void setname(String setterValue) {
	this.value1=setterValue;
}
		public static void main(String[] args) {
			Vehicle obj=new Vehicle();
			obj.setname("Executed Successfully");
			System.out.println(obj.getname());
		}
}
*/

//INHERITANCE

//SINGLE INHERTANCE
/*
class Car{
	public String V_Name="Toyato";
}
public class Vehicle extends Car{
	String V_wheelType="fourWheeler";
public static void main(String[] args) {
	Vehicle obj=new Vehicle();
	System.out.println(obj.V_Name+"-->"+obj.V_wheelType);
}
}
*/

/*
//MULTI_LEVEL_INHERITANCE
class Car{
	public String V_Name="Toyato";
}
class Bus extends Car{
	public String V_wheelType="fourWheeler";
}
public class Vehicle extends Bus{
	String V_Running="runsInRoad";
public static void main(String[] args) {
	Vehicle obj=new Vehicle();
	System.out.println(obj.V_Name+"-->"+obj.V_wheelType+"-->"+obj.V_Running);
}
}
*/

//POLYMORPHISM

//COMPILETIME POLYMORPHISM
/*
public class Vehicle{
 int car(int a, int b) {
		return a+b;
	}
 Double bicycle(double a, double b) {
		return (a+b);
	}
 String bus(String a) {
		return a;
	}
public static void main(String[] args) {
	Vehicle obj=new Vehicle();
	System.out.println(obj.car(10,20));
	System.out.println(obj.bicycle(1.5d,2.5d));
	System.out.println(obj.bus("StringVal"));
}
}
*/
//RUNTIME POLYMORPHISM
/*
class Bicycle {
	  public void vehicaldetails() {
	    System.out.println("Toyato");
	  }
	}

	class Car extends Bicycle {
	  public void vehicaldetails() {
	    System.out.println("fourWheeler");
	  }
	}

	class Bus extends Car {
	  public void vehicaldetails() {
	    System.out.println("runsInRoad");
	  }
	}

	class Vehicle {
	  public static void main(String[] args) {
		  Bicycle myBicycle = new Bicycle();  
		  Bicycle myCar = new Car();  
		  Bicycle myBus = new Bus(); 
		  myBicycle.vehicaldetails();
		  myCar.vehicaldetails();
		  myBus.vehicaldetails();
	  }
}
*/

//ABSTRACTION
/*

abstract class Bicycle{  
  abstract void run();  
}  
class Car extends Bicycle{  
public void run(){
	System.out.println("running safely");
}  
}
public class Vehicle{
public static void main(String args[]){  
	Car obj = new Car();  
 obj.run();  
}
} 
*/