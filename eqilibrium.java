import java.util.*;
public class eqilibrium {

	public static void main(String[] args) 
	{
	
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
        	int sum=0;
        	int c=0;
        	int size=sc.nextInt();
        	if(size==1)
        	{
        		System.out.print("1");
        	}
        	if(size>1)
        	{
        	int b[]=new int[size];
        	for(int i=0;i<size;i++)
        	{
        		b[i]=sc.nextInt();
        	}
        	for(int i=0;i<size-1;i++)
        	{
        		sum=sum+b[i];
        		if(sum==b[i+1])
        		{
        			c=i+1;
        		}
        	}
        	int sum1=0;
        	int d=0;
        	for(int i=size-1;i>1;i--)
        	{
        		sum1=sum1+b[i];
        		if(sum1==b[i-1])
        		{
        			d=i-1;
        		}
        	}
        	if(sum==sum1)
        	{
        		System.out.print(c);
        	}
        	}
        	
        	a--;
        }
	}

}
