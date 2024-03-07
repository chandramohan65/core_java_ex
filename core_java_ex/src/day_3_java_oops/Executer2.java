package day_3_java_oops;

import day_3_java_oop.Customer;

public class Executer2 {
	 public static void main(String[] args) {
    	 Customer1 cl=new Customer1();
    	 cl.setCid(112);
    	 cl.setCname("chandru");
    	 cl.setAddress("BAhour");
    	 System.out.println("Customer id:"+cl.getCid()+" Customer name:"+cl.getCname()+" Customer Address:"+cl.getAddress());
         Customer1 c2=new Customer1();
         c2.setCid(114);
    	 c2.setCname("sha");
    	 c2.setAddress("pondy");
    	 System.out.println(c2); //calling the tostring constructor
    	 
    	 Customer1 c3=new Customer1(); //invoke explicit default constructor
    	 System.out.println(c3);
    	 
    	 Customer1 c4=new Customer1(114,"dhin","chennai"); //invoke parameterized constructor
    	 System.out.println(c4);
     }
}
