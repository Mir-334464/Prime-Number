import java.util.*;

class prime1

  {
  
    public static void main(String[]args)

       {

        Scanner sc=new Scanner(System.in);
	

       System.out.println("Enter Number To Check Whether It Is Prime Or Not");

        int N=sc.nextInt();
      
       int i=2;
while(i<=N)
       {

         if(i%N==0)

          break;
          i++;
         }

        if(N==i)

         System.out.println(+N+" is a Prime Number");

         else

         System.out.println(+N+" is Not a Prime Number");
  

                }
     }

 
