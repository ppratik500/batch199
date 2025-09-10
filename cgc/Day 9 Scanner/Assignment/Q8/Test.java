import java.util.Scanner;

public class Test
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
Course co= new Course();

co.courseName=sc.next();
co.duration=sc.nextInt();
co.fees=sc.nextInt();

System.out.println("courseName");
System.out.println("duration");
System.out.println("fees");
}
}