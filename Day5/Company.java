import java.util.Scanner;
class Company{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
char gen;
char mar;
int age;
System.out.println("Enter the Gender, Marital Status And age respectively : ");
gen=sc.next().charAt(0);
mar=sc.next().charAt(0);
age=sc.nextInt();
if(mar=='Y')
{
System.out.println("Insured");
}
else if(gen=='F' && age>25 )
{
System.out.println("Insured");
}
else if(gen=='M' && age>30)
{
System.out.println("Insured");
}
else{
System.out.println("Not Insured");
}
}
}                                                                                                                                                                                                                                                                                                                                                   