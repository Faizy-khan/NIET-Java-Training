import java.util.Scanner;
class arra{
void min(int x)
{
Scanner v=new Scanner(System.in);
int ar[] =new int[x];
int min;
//Input loop
for(int i=0;i<x;i++)
{
System.out.print("Enter the element no. A["+i+"] : ");
ar[i]=v.nextInt();
}
//Min Loop
min=ar[0];
for (int j=0;j<x;j++)
{ 
if(min>ar[j]);
{
min=ar[j];
}
}
System.out.println("The minimum Number is : "+min);
}
}
class Minarray
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the size: ");
int y=sc.nextInt();
arra z= new arra();
z.min(y);
}
}                                                                                                                                                                                                                                                                                                                                                                                