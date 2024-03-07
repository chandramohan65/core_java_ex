package day_3_java_oops;

public class Customer1 {
          private int cid;
          private String cname;
          private String address;
          //default constructor
          public Customer1()
          {
        	  this.cid=01;
        	  this.cname="cm";
        	  this.address="USA";
          }
          //parameterized constructor
          public Customer1(int cid,String cname,String address)
          {
        	  this.cid=cid;
        	  this.cname=cname;
        	  this.address=address;
          }
          //Getter and Setter
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


