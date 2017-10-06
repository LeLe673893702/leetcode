import jdk.internal.instrumentation.ClassInstrumentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static Random random = new Random(47);
    public static void main(String[] args) {
/*        MergeSort mergeSort = new MergeSort();
        Comparable[] comparable = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        mergeSort.sort(comparable);
        mergeSort.show(comparable);*/

    }

}

class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a,B b) {
        first = a;
        second = b;
    }
    public String toString() {
        return "(" + first + "." +second+")";
    }


}

class TupleTest {
    static TwoTuple<String , Integer> f() {
        return new TwoTuple<>("hi",47);
    }
}
