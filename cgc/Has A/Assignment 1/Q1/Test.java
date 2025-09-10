public class Test{
public static void main(String[]args)
{
Order or=new Order();
      or.id=22;
      or.orderdate="22-1-2025";
      or.paymentmethod="UPI";

or.cus=new Customer();
or.cus.name="Pratik";
or.cus.email="pratikparalikar11@gmail.com";
or.cus.address="Swargate"; 

or.cus.ca=new Cart();
or.cus.ca.quantity=1;
or.cus.ca.amount=5000;

or.cus.ca.pro=new Product();
or.cus.ca.pro.name="i-phone 16";
or.cus.ca.pro.price=150000;
or.cus.ca.pro.brand="i-phone";

System.out.println(or.id);
System.out.println(or.orderdate);
System.out.println(or.paymentmethod);
System.out.println(or.cus.name);
System.out.println(or.cus.email);
System.out.println(or.cus.address);
System.out.println(or.cus.ca.quantity);
System.out.println(or.cus.ca.amount);
System.out.println(or.cus.ca.pro.name);
System.out.println(or.cus.ca.pro.price);
System.out.println(or.cus.ca.pro.brand);
}
}


