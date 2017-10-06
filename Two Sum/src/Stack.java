import java.util.Iterator;

/**
 * Created by 刺雒 on 2017/9/15.
 */
public class Stack<Item> {
    private Item[] data ;
    private int top = 0;
    private int maxsize = 100;
    public Stack() {

    }

    // 重新分配数组空间
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[maxsize];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    // 弹出
    Item pop() {
        Item item = data[--top];
        return data[top--];
    }

    // 弹入
    void push(Item item) {
        if (maxsize == data.length) {
            resize(2*data.length);
        }
        data[top++] = item;
    }

    // 栈是否为空
    boolean isEmpty() {
        if (data.length == 0) {
            return true;
        }
        return false;
    }

    // 栈中的元素数量
    int size() {
        return data.length;
    }


}
