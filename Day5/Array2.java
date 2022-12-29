import java.util.Scanner;
class arra{
void display(int x)
{
Scanner v=new Scanner(System.in);
int ar[] =new int[x];
int sum=0;
for(int i=0;i<x;i++)
{
System.out.print("Enter the element no. A["+i+"] : ");
ar[i]=v.nextInt();
}
System.out.println("--------------------------------------------------------------------------------------------------------------------");
for(int j=0;j<x;j++)
{
System.out.println("ar["+j+"] = "+ar[j]);
sum=sum+ar[j];
}
System.out.println("Sum Is :"+sum);
}}
class Array2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the size: ");
int y=sc.nextInt();
arra z= new arra();
z.display(y);
}
}                                                                                                               