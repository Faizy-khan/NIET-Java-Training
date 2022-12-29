import java.util.Scanner;
class ques2
{
public static void main(String args[])
{
int sum=0;
Scanner sc=new Scanner(System.in);
int ar[]=new int[5];
for(int i=0;i<5;i++)
{
ar[i]=sc.nextInt();
}
for(int k=0;k<5;k++)
{
sum=sum+ar[k];
}
int avg=sum/5;
for(int m=0;m<5;m++)
{
if(avg<=ar[m])
{
System.out.println("The elements greater than the average are:"+ar[m]+"at index"+m);
}
}
}
}