/**
 * Created by 刺雒 on 2017/9/15.
 */
class Node {
    String item;
    Node next;
}
public class LinkedList {
    private  Node first = new Node();


    // 创建空链表
    public void createList(String[] datas) {
        Node temp=null;
        for (int i = 0; i < datas.length; i++) {
            if (i==0) {
                first.item = datas[i];
                temp = first;
            } else {
                Node node = new Node();
                node.item = datas[i];
                temp.next = node;
                temp = node;
            }
        }
    }

    // 遍历链表
    public void  ergodicList(Node node) {
        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }

    // 插入节点
    public void  insertList(Node node,int pos) {
        Node temp = first;
        if (pos == 1) {
            node.next = first;
            first = node;
            return;
        }
        for (int i = 1; temp != null; i++) {
            if (i==pos-1) {
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
    }

    // 删除节点
    public void deleteNode(int pos) {
        Node temp = first;
        if (pos == 1) {
            first = first.next;
        }
        for (int i = 1; temp != null; i++) {
            if (i == pos-1) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    // 返回首节点
    public Node getFirst() {
        return first;
    }
}
