/**
 * Created by 刺雒 on 2017/9/22.
 */
public class InsertSort extends SortTemplet{
    @Override
    void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                // 后面的比前面的小
                if (less(a[j],a[j-1])) {
                    exch(a,j,j-1);
                }
            }
        }
    }
}
