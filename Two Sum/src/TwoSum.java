import java.util.Arrays;

/**
 * Created by 刺雒 on 2017/9/17.
 */
public class TwoSum {
    private int[] data = {1,5,10,7,15,-1,-3,-5};
    private int sum = -1;
    public void towSum() {

        Arrays.sort(data);
        for (int j : data) {
            System.out.print(j+" ");
        }
        for (int i = 0; i < data.length; i++) {
            sum = -1;
            find(-data[i],data);
            // 防止寻找重复
            if (sum>i) {
                System.out.println(i+"----"+sum);
            }
        }

    }
// -1,1,3,5,7,9,10
    // 二分查找
    public void find(int i,int j,int d,int[] a) {
        if (d == a[(i+j)/2] ) {
            sum = (i+j)/2;
            return;
        }
        if (Math.abs(i - j) == 1) {
            return;
        }
        if (d < a[(i+j)/2]) {
            find(i,(i+j)/2,d,a);
        }

        if (d > a[(i+j)/2]) {
            find((i+j)/2,j,d,a);
        }
    }

    public void find(int d,int[]a) {
        int i = 0;
        int j = a.length-1;
        while (i <= j) {
            int m = (i+j)/2 ;
            if (d == a[m]) {
                sum = m;
                return;
            }

            else if (d > a[m]) {
                i = m+1;
            }

            else if (d < a[m]) {
                j = m-1;
            }
        }
        sum = -1;
    }
}
