
import java.util.Scanner;

// public class greet {
//     public static void main(String[] args) {
//         String personalised =myGreet("aashi");
//         System.out.println(personalised);

//     }
//     static String myGreet(String name){
//         String message ="hello"+name;
//         return message;
//     }
// }

public class greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String naam) {
        String message = "hello" + "     " + naam;
        return message;
    }

}