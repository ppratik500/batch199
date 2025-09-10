public class Test{
public static void main(String[]args)
{
Marketplace ma=new Marketplace();
            ma.platformname="Akola";
            ma.country="India";
            ma.websiteURL="WWW.Akola.com";

ma.se=new Seller();
ma.se.name="Omkar";
ma.se.rating=5;
ma.se.sellerid=101;

ma.se.in=new Inventory();
ma.se.in.warehouselocation="Pune";
ma.se.in.lastupdatedate="3month";

ma.se.in.it=new Item();
ma.se.in.it.name="Pen";
ma.se.in.it.price=10;
ma.se.in.it.stockcount=50000;

System.out.println(ma.platformname);
System.out.println(ma.country);
System.out.println(ma.websiteURL);
System.out.println(ma.se.name);
System.out.println(ma.se.rating);
System.out.println(ma.se.sellerid);
System.out.println(ma.se.in.warehouselocation);
System.out.println(ma.se.in.lastupdatedate);
System.out.println(ma.se.in.it.name);
System.out.println(ma.se.in.it.price);
System.out.println(ma.se.in.it.stockcount);
}
}
