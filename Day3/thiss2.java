class thiss2
{
int x=5;
int y=10;
void add(int x,int y)
{
this.x=x;
this.y=y;
System.out.println("X(Local)"+this.x);
System.out.println("Y(Local)"+this.y);
System.out.println("X"+x);
System.out.println("Y"+y);
}
public static void main(String args[])
{
thiss2 tk1 = new thiss2();
tk1.add(2,4);
}}