/**
 * Created by 刺雒 on 2017/9/16.
 */



public class LinkedStack<Item> {
    class Node{
        Item item;
        Node next;
    }
    private int N;
    private Node first;
    // 判断是否为空
    public boolean isEmpty() {
        return first == null;
    }

    // 返回栈内的元素数量
    public int size() {
        return N;
    }

    // 压入栈顶
    public void push(Item item) {
        // 每次最上面的都是刚压入栈中的
        // 然后oldfirst保存之前那个的
        // 然后跟在最新的那个后面
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    // 从栈顶删除元素
    public Item pop() {
        Item item = first.item;
        first =  first.next;
        N--;
        return item;
    }

}
