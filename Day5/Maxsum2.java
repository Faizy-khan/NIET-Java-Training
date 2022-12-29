import java.util.Scanner;
class arra{

Scanner v=new Scanner(System.in);
void display(int x,int y){
int col[]=new int[y];
int ar[][]=new int[x][y];
int sum1=0;
int sum2=0;s
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
System.out.print("Enter the element no. A["+i+"]["+j+"] :");
ar[i][j]=v.nextInt();
}
}
//print loop
System.out.println("---------------");
for(int i=0;i<x;i++)
{
sum1=0;
sum2=0;
for(int j=0;j<y;j++)
{
System.out.print(ar[i][j]+" | ");
sum1=sum1+ar[i][j];
sum2=sum2+ar[j][i];
}
col[i]=sum2;
System.out.println(sum1);
}
System.out.println("---------------");
for(int k=0;k<y;k++)
{
System.out.print(col[k]+" | ");
}
}

}
class Maxsum2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the Row size: ");
int y=sc.nextInt();
System.out.print("Enter the Col size: ");
int c=sc.nextInt();
arra z= new arra();
z.display(y,c);
}
}                                                                                                                                                                                                                                                                                                   