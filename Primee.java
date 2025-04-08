import java.util.Scanner; // for taking input from user
class Primee 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner ( System.in );//object of scanner
        System.out.print("Enter The Number To Check Prime Or Not : ");
        int num = sc.nextInt(); 

        if(num<=1)//check weather the number is less than 1 if yes its not prime (Base Condition)
        {
            System.out.println(" Not a Prime ");
        }
        else //Main Condtition
        {
            boolean flag = true; // a boolean var to track weather the number is prime or not if it is true till the loop is terminated number will be prime
            
            for (int i = 2;i <=num/2;i++)//for loop starts from 2 and runs till the number is num /2 we took this condition because prime number is 
                                            //definitly not fully divided until it reaches its half value and non-prime numbers are fully divided 
                                            // and its reminder is 0 till it reaches half of its value... 
            {
                   if(num % i == 0)// if num % i == 0 here we are checking weather the number is fully divided with 
                                    //the i and reminder is 0 until it reaches half of its value if yes then the flag gets false
                                    // and loop gets terminated with the help of break and controls moves to next lines 
                   {
                    flag = false;
                    break;
                   }
            }   
            if(flag) // if flag is true its prime this block gets executed
            System.out.println(num +"Is Prime");
        else            // if flag is false then this block gets executed 
            System.out.println(num+ " is Not Prime");
        }


    }
}