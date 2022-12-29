import java.util.Scanner;
class Statloop
{
void show() {  
    Scanner sc=new Scanner(System.in);
    int i; 
    i=sc.nextInt();
    System.out.println("I is :" +i);
}
public static void main(String args[])
{
Statloop a = new Statloop();
a.show();
a.show();
}
}