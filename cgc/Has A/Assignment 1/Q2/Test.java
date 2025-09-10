public class Test
{
public static void main(String[]args)
{

Hotel ho=new Hotel();
      ho.name="Taj";
      ho.location="Mumbai";
      ho.rating=5;

ho.re=new Reception();
ho.re.shifttime="10 to 6";
ho.re.receptionistname="Divya";

ho.re.gu=new Guest();
ho.re.gu.name="Pratik";
ho.re.gu.age=26;
ho.re.gu.contactnumber="7447695688";

ho.re.gu.ro=new Room();
ho.re.gu.ro.type="Ac room";
ho.re.gu.ro.roomnumber=101;
ho.re.gu.ro.priceprenight=6000;

System.out.println(ho.name);
System.out.println(ho.location);
System.out.println(ho.rating);
System.out.println(ho.re.shifttime);
System.out.println(ho.re.receptionistname);
System.out.println(ho.re.gu.name);
System.out.println(ho.re.gu.age);
System.out.println(ho.re.gu.contactnumber);
System.out.println(ho.re.gu.ro.type);
System.out.println(ho.re.gu.ro.roomnumber);
System.out.println(ho.re.gu.ro.priceprenight);
}
}


