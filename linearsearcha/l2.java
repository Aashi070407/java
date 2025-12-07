package linearsearcha;

public class l2 {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'a';
        // System.out.println(linearSearch(name, target))
        // 
        System.out.println(name.toCharArray());
    }

    static boolean linearSearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        } 
      for ch :str.toCharArray() {
        if (ch == target) {
            return true;
        }
      }
      return false;
     }
static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
