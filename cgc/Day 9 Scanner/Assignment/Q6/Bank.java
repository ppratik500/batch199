import java.util.Scanner;

public class Bank
{
public static  void main(String[]args)
{
Scanner sc= new Scanner(System.in);

String Bankname=sc.next();
String cityname=sc.next();
int accountNumber=sc.nextInt();
int balance=sc.nextInt();

System.out.println("Bank Name="+Bankname);
System.out.println("City Name="+cityname);
System.out.println("account Number="+accountNumber);
System.out.println("balance="+balance);
}
}