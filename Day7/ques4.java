import java.util.Scanner;
class ques4{
public static void main(String args[])
{
String a,b;
Scanner sc= new Scanner(System.in);
a=sc.next();
b=sc.next();
if(a.equals(b))
{
System.out.println("The given Strings are equal");
}
else
{
System.out.println("The given Strings are not equal");
}
}
}