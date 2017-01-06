class variables
{
   int assignment=1;
   int num=0;
   int marks=0;
   int age=0;

}

class BusinessLogic
{

  
 public void DisplayPattern (int num )
   {
      for(int i=1;i<=num;i++)
        {
             for(int j=i;j>=1;j--)
             {
               System.out.print(j);
             }
            System.out.println();
    
        }
   }


 public void chkPrime(int num)
   {  
        int temp;
	boolean isPrime=true;       
       for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   
   }  

public void aliquotdivisors(int num)
   {  
        int temp=0;
   
        int tempsum=0;
	       
       for(int i=1;i<num;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      tempsum=tempsum+i;
	
	   }
	}
	
	   System.out.println("Output is"+tempsum );
   
   }    

}


class assignment2
{

public static void main(String[] args)
{
    variables v1 =new variables();
    BusinessLogic L1=new BusinessLogic();

    System.out.print("Please Enter 1 for Pyramid Printing, 2 for Check Prime Number,3 for Aliquot divisors  : "); 
    v1.assignment=Integer.parseInt(System.console().readLine());

    
    if(v1.assignment==1) 
        {
            System.out.print("Please Enter Number for Pyramid Printing: ");    
            v1.num=Integer.parseInt(System.console().readLine());   
            L1.DisplayPattern (v1.num);
        }

    else if(v1.assignment==2) 
        {
            System.out.print("Please Enter Number for check prime or not: ");    
            v1.num=Integer.parseInt(System.console().readLine());   
            L1.chkPrime(v1.num);

        }
else if(v1.assignment==3) 
        {
            System.out.print("Please Enter Number for aliquot divisors: ");    
            v1.num=Integer.parseInt(System.console().readLine());   
            L1.aliquotdivisors(v1.num);

        }


    
} 
}