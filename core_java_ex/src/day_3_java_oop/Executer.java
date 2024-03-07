package day_3_java_oop;

public class Executer {
         public static void main(String[] args) {
        	 Customer cl=new Customer();
        	 cl.setCid(112);
        	 cl.setCname("chandru");
        	 cl.setAddress("BAhour");
        	 System.out.println("Customer id:"+cl.getCid()+" Customer name:"+cl.getCname()+" Customer Address:"+cl.getAddress());
         }
}
