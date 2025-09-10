public class Test
{
public static void main(String[]args)
{

Booking bo=new Booking();
        bo.bookingid=22;
        bo.date="25-10-2025";
        bo.timeslot="10am";

         bo.cu=new Customer();
         bo.cu.phonenumber="7447695688";
         bo.cu.city="Pune";

        bo.cu.se=new Service();
        bo.cu.se.type="home dilevery";
        bo.cu.se.price=20000000;
        bo.cu.se.duration="4 month";

    bo.cu.se.ca= new Car();
    bo.cu.se.ca.name="BMW";
    bo.cu.se.ca.registrationnumber=45;
    bo.cu.se.ca.colour="black";
    
System.out.println(bo.bookingid);
System.out.println(bo.date);
System.out.println(bo.timeslot);
System.out.println(bo.cu.phonenumber);
System.out.println(bo.cu.city);
System.out.println(bo.cu.se.type);
System.out.println(bo.cu.se.price);
System.out.println(bo.cu.se.duration);
System.out.println(bo.cu.se.ca.name);
System.out.println(bo.cu.se.ca.registrationnumber);
System.out.println(bo.cu.se.ca.colour);
}
}
