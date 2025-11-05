
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

       // take input from user till user does not press X or x
       System.out.println("enter the operator");
       int ans=0;
       while(true)
        
     { 
        char op =in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op=='%' ) 
        {
            System.out.println("enetr 2 number");
            int n1 =in.nextInt();
             int n2 =in.nextInt();

             if(op =='+'){
                ans =n1+n2;
             }
             if(op=='-'){
                ans =n1-n2;
             }
             if(op=='*'){
                ans =n1*n2;

             }
             if(op=='/'){
                if(n2!= 0){
                    ans = n1/n2;   } else {System.out.println("invalid");}             

             }
             if(op=='%'){
                ans = n1 % n2 ;
             }

             if (op == 'x' || op== 'X' ){
                break;
             }else{
                System.out.println("invalid ");
             }
          System.out.println(ans);
        } 
       
    }
       
    }
   
}
