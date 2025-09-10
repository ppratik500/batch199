public class Test
{
public static void main(String[]args)
{
Employee emp = new Employee();
         emp.id=1;
         emp.sallary=75000;
       
Company com = new Company();
        com.Cname="TCS";
        com.Caddress="Swargate";

emp.cop=com;
System.out.println(emp.id);
System.out.println(emp.sallary);
System.out.println(emp.cop.Cname);
System.out.println(emp.cop.Caddress);
}
}