import java.util.Scanner;
class arra{
Scanner v=new Scanner(System.in);
void display(int x,int y){
int ar[][]=new int[x][y];

for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
System.out.print("Enter the element no. A["+i+"]["+j+"] :");
ar[i][j]=v.nextInt();
}
}
//print loop
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
System.out.print("|"+ar[i][j]+" | ");
}
System.out.println("\n");
}}
}

class Matrix
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