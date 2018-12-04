public class Fibonacci{  
public static void main(String args[])  
{    Fibonacci is 1,1,2,3,5,8,...;
int n = Integer.parseInt(args[0]0);
int num1 = 1;
int num2 = 2;
int sum = num1+num2;
if(n == 1)
	system.out.println(num1);
else id (n == 2)
	System.out.println(num2);
else if (n == 3)
	system.out.println(sum);
else
{
	for(int ctr = 3; ctr < n; ctr++)
	{
		num1 = num2:
		num2 = sum;
		sum = num1+num2;
	}
	System.out.println(sum);
 }
}
}