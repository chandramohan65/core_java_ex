package day_3_java_oop;

public class Customer {
       private int cid;
       private String cname;
       private String address;
       
       public void setCid(int cid)
       {
    	   this.cid=cid;
       }
       public int getCid()
       {
    	   return cid;
       }
       public String getCname() {
    	   return cname;
       }
       public void setCname(String cname) {
    	   this.cname = cname;
       }
       public String getAddress() {
    	   return address;
       }
       public void setAddress(String address) {
    	   this.address = address;
       }
       @Override
       public String toString()
       {
    	   return "Customer [cid = "+cid+", cname=" + cname +", addreess="+address+"]";
       }
       
}
