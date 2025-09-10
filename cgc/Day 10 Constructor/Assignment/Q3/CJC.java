public class CJC
{
String instituteName;
String instituteAddress;
public CJC()
{
instituteName="Welcome to CJC";
instituteAddress="Karvenagar";
}
public void printInstituteName()
{
System.out.println(instituteName);
}
public void printInstituteAddress()
{
System.out.println(instituteAddress);
}

public static void main(String[]args)
{
CJC c1= new CJC();
    c1.printInstituteName();
    c1.printInstituteAddress();
}
}