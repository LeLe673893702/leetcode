/**
 * Created by 刺雒 on 2017/9/16.
 */
public class LinkedQueue<Item> {
    class Node{
        Item item;
        Node next;
    }
    private Node first,last;
    private int N;

    //判断是否为空
    public boolean  isEmpty() {
        return first == null;
    }

    // 把新节点接到后面
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        // 如果是空的首尾都指向第一个
        if (last == null) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    // 从队首弹出
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }
}
