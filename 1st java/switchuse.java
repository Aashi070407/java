
import java.util.Scanner;


public class switchuse{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String fruit = in.next();

        switch (fruit) {
            case("mango") :
                System.out.println("king ");
                break;
                case("apple") :
                System.out.println("red ");
                break;
                case("banana") :
                System.out.println("ripe ");
                break;
            default:
                throw new AssertionError();
        }
        

    }
}



// switch (fruit) {
//     case "mango" -> System.out.println("king");
//     case "apple" -> System.out.println("red");
//     case "banana" -> System.out.println("ripe");
//     default -> System.out.println("unknown");
// }
