public class Test
{
public static void main(String[]args)
{
Student abhi=new Student();
        abhi.rollno =1;
        abhi.name="Abhishek";

abhi.laddress=new Address();
abhi.laddress.cityname="pune";
abhi.laddress.areaname="karvenagar";

Address a=new Address();
        a.cityname="Akola";
        a.areaname="Jatharpeth";

abhi.paddress=a;

System.out.println(abhi.rollno);
System.out.println(abhi.name);
System.out.println(abhi.paddress.cityname);
System.out.println(abhi.paddress.areaname);
System.out.println(abhi.laddress.cityname);
System.out.println(abhi.laddress.areaname);
}
}

