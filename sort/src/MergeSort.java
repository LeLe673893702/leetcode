import java.util.*;

/**
 * Created by 刺雒 on 2017/9/23.
 */
public class MergeSort extends SortTemplet{
    Comparable[] temp ;
    @Override
    void sort(Comparable[] a) {
        show(a);
        temp = new Comparable[a.length];
        divide(a,0,a.length-1);

    }

    // 划分
    private void divide(Comparable[] a,int low,int high) {
        if (high <= low)
            return;
        int mid =  (low+high)/2;
        // 分割左边
        divide(a,low,mid);
        // 分割右边
        divide(a,mid+1,high);
        merge(a,low,high,mid);
    }

    // 合并
    public void merge(Comparable[] a,int low,int high,int mid) {
        int i,j,t ;
        Queue<Integer> queue = new LinkedList<>();
        for (i = low,j = mid+1,t = 0; i < mid+1 && j <= high; ) {
            if (less(a[i],a[j])) {
                temp[t++] = a[i++];
            } else {
                temp[t++] = a[j++];
            }
        }

        // 如果左边有剩下的，把左边剩下的加进去
        while (i < mid+1) {
            temp[t++] = a[i++];
        }

        // 如果右边有剩下的，就把右边剩下的加进去
        while (j <= high) {
            temp[t++] = a[j++];
        }
        System.arraycopy(temp,0,a,low,t);


    }
    public class Inner{
        public MergeSort outer() {
            return MergeSort.this;
        }
    }
}
