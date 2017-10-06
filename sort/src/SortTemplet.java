/**
 * Created by 刺雒 on 2017/9/22.
 */
public abstract class SortTemplet {
     abstract  void sort(Comparable[] a) ;
    public boolean less(Comparable v, Comparable w) {
        // v<w
        return v.compareTo(w) < 0;
    }

    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"---");
        }
        System.out.println();
    }

    public boolean isSorter(Comparable[] a) {
        for(int i = 1; i < a.length; i ++) {
            if (less(a[i-1],a[i])) {
                return false;
            }
        }
        return true;
    }
}
