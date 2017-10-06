/**
 * Created by 刺雒 on 2017/9/22.
 */
public class SelectSort extends SortTemplet{
    @Override
    public void sort(Comparable[] a) {
        int min;
        for (int j = 0; j < a.length; j++) {
            min = j;
            for (int i = j+1; i < a.length; i++) {
                if (less(a[i], a[min])) {
                    exch(a, i, min);
                    min = i;
                }
            }
        }
    }



}


