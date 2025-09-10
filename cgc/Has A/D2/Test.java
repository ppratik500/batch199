public class Test
{
public static void main(String[]args)
{

Student stu=new Student();
        stu.id=1;
        stu.name="Pratik";
     
Address add=new Address();
        add.cityname="Pune";
        add.areaname="Swargate";

stu.padd=add;

System.out.println(stu.id);
System.out.println(stu.name);
System.out.println(stu.padd.cityname);
System.out.println(stu.padd.areaname);
}
}