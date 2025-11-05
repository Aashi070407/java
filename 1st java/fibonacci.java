
// import java.util.Scanner;

// public class fibonacci {
//     public static void main(String[] args) {
//     Scanner input = new Scanner (System.in);

//     int n = input.nextInt();
//     int a=0;
//    int  b=1;
//     int count =2;
//     while (count<=n){
//         int temp =b;
//         b = a+b ;
//         a= temp;
//       count++;
//     }



// System.out.println(b);

//     }

// }


import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int n = input.nextInt();
    int a=0;
   int  b=1;
   
    for (int i = 2; i < n; i++) {
            int next = a+b;
            System.out.println(  + next);
            a=b;
            b=next;
    }



System.out.print(a+b);

    }

}


