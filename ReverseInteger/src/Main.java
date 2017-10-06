import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Solution solution = new Solution();
        System.out.println(solution.reverse(-2147483648));
    }

    public static class Solution {
        public int reverse(int x) {
            int text = Math.abs(x);
            int result = 0;
            int length = String.valueOf(text).length();
            if (x >= Integer.MAX_VALUE  || x <= Integer.MIN_VALUE) {
                return 0;
            }
            if (x < 0) {
                for (int i = 0; i < length; i++) {
                    result += (text % 10) * Math.pow(10, length - i - 1);
                    text = text / 10;

                }
                if (result >= Integer.MAX_VALUE ) {
                    return 0;
                }
                result *= -1;
            } else {
                for (int i = 0; i < length; i++) {
                    result += (text % 10) * Math.pow(10, length - i - 1);
                    text = text / 10;
                }
                if (result >= Integer.MAX_VALUE ) {
                    return 0;
                }
            }


            return result;
        }
    }
}