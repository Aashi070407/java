package linearsearcha;
// run outside folder because we use package so 
// java linearsearcha.l
// 
// 
public class l {
    public static void main(String[] args) {
        int[] nums = {2,67,4,7,3,-1,9,-123};
        int target = 9;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
