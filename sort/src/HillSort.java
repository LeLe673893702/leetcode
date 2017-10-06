/**
 * Created by 刺雒 on 2017/9/22.
 */
public class HillSort extends SortTemplet {
    @Override
    void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        // 先找到一个初始化
        while (h < n/2) {
            h = 2*h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
               for (int j = i; j >= h; j -=h) {
                   if (less(a[j],a[j-h])) {
                       exch(a,j,j-h);
                   }
               }
            }
            h= h/2;
        }
    }
}
