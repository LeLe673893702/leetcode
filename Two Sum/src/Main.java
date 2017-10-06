import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
   /*     LinkedList linkedList = new LinkedList();
        linkedList.createList(new String[]{"1","2","3"});
        Node node = new Node();
        node.item = "4";
        linkedList.insertList(node,2);
        linkedList.deleteNode(4);
        linkedList.ergodicList(linkedList.getFirst());*/
        TwoSum twoSum = new TwoSum();
        twoSum.towSum();
    }
}

class C{
    C(int i) {

    }
}

class D extends C{
    D(int i) {
        super(i);

    }
}

class A {
    String equation = "(1+2+(4*5))";
    Stack<Character> stringStack = new Stack<>();
    Stack<Integer> integerStack = new Stack<>();

    void push() {
        for (int i = 0; i < equation.length(); i++) {
            switch (equation.charAt(i)) {
                case '(':
                    break;
                case '+':
                    stringStack.push('+');
                    break;
                case '-':
                    stringStack.push('-');
                    break;
                case '*':
                    stringStack.push('*');
                    break;
                case '/':
                    stringStack.push('/');
                    break;
                case ')':
                    pop();
                    break;
                default:
                    integerStack.push(equation.charAt(i)-48);
                    break;
            }
        }
        System.out.println(integerStack.pop());
    }
    void pop() {
        int value = integerStack.pop();
        char operator = stringStack.pop();
        switch (operator) {
            case '+':
                value = value + integerStack.pop();
                break;
            case '-':
                value = value - integerStack.pop();
                break;
            case '*':
                value = value * integerStack.pop();
                break;
            case '/':
                value = value / integerStack.pop();
                break;
        }
        integerStack.push(value);
    }
}

class B {

    B(){
      System.out.println("B");
    }
    public void f() {
        System.out.println("B方法");
    }
}