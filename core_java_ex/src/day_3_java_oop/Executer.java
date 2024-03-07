package day_3_java_oop;

public class Executer {
         public static void main(String[] args) {
        	 Customer cl=new Customer();
        	 cl.setCid(112);
        	 cl.setCname("chandru");
        	 cl.setAddress("BAhour");
        	 System.out.println("Customer id:"+cl.getCid()+" Customer name:"+cl.getCname()+" Customer Address:"+cl.getAddress());
             Customer c2=new Customer();
             c2.setCid(114);
        	 c2.setCname("sha");
        	 c2.setAddress("pondy");
        	 System.out.println(c2);
            
         }
}
