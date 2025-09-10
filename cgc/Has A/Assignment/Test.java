public class Test
{
public static void main(String[]args)
{
Company Bny=new Company();
        Bny.id=300;
        Bny.name="BNY Mellon";

Address a=new Address();
        a.cityname="Pune";
        a.areaname="Swargate";
        Bny.paddress=a;


System.out.println(Bny.id);
System.out.println(Bny.name);
System.out.println(Bny.paddress.cityname);
System.out.println(Bny.paddress.areaname);
}
}