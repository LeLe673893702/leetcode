public class Main {

    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1000;i++){
            s = s+"a";
        }
      //  String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        //abcdlkjhgfdsadcba
        //abbcbbc cbbcbba
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s).length());
    }

}
// abcdefabba
// abbafedcba

class Solution {
    public String longestPalindrome(String s) {
        String huiwen = "";
        //"ddtattarrattatdd"
        String resverse = new StringBuilder(s).reverse().toString();
        // bcbcb
        if (s.length() > 1000 && s.length() == 0) {
            return "";
        }
        int i, j, k;

        for (i = 0; i < s.length(); i++) {
            j = i ;
            k = i ;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                if (huiwen.length() < k - j + 1) {
                    huiwen = s.substring(j, k + 1);
                }
                j--;
                k++;
            }
        }
        if (huiwen.length() != s.length()) {
            System.out.println(s.length());
            for (i = 0; i < s.length(); i++) {
                j = i;
                k = i + 1;
                while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                    if (huiwen.length() < k - j + 1) {
                        huiwen = s.substring(j, k + 1);
                    }
                    j--;
                    k++;
                }
            }
        }



        // bcbcb
        //bbbb
        //


        return huiwen;
    }
}



