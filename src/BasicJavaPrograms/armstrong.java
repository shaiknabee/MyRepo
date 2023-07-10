package BasicJavaPrograms;

public class armstrong {
	public static void main(String[]args)
	{  
		
		    int n=153;
			int temp=n;
			int sum=0,pre=0,b=1,mod;
			while(temp>0)
			{
				temp=temp/10;
				sum++;
			}
			int tempo=n;
			while(tempo>0)
			{
				mod=tempo%10;
				for(int i=1;i<=sum;i++)
				{
					b=b*mod;
				}
				pre=pre+b;
				b=1;
				tempo=tempo/10;
				
			}
            
			if(pre==n)
			{
				
				System.out.print(pre+" ");
				
			}
			
		
		
	}

}
