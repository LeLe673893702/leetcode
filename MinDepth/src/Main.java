public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BinTree binTree = new BinTree();
        binTree.put(5);
        binTree.put(10);
        binTree.put(15);
        binTree.minDepth();
        System.out.println(binTree.minDepth());
    }
}
