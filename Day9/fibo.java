package p1;
class fibo
{
void fib(int n)
{
int x=0;
int y=1;
int sum=1;
System.out.print("0 ");
for(int i=3;i<=n+1;i++)
{
System.out.print(sum +" ");
sum=x+y;
x=y;
y=sum;
}
}
}