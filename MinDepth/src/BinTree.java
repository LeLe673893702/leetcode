import org.omg.CORBA.PUBLIC_MEMBER;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by 刺雒 on 2017/10/6.
 */
public class BinTree {
    public TreeNode treeNode;
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public void  put(int value ){
       treeNode =  put(value,treeNode);
    }

    /*
    * 增加节点
    * */
    private TreeNode put(int value,TreeNode root) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (root.val > value) {
            root.left = put(value, root.left);
        } else {
            root.right = put(value, root.right);
        }

        return root;
    }

    public int minDepth(){
        return minDepth(treeNode);
    }

    /*
    * 最小深度
    * */
    private int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return  depth;
        }
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        arrayList.add(root);

        while (true) {
            ArrayList<TreeNode> treeNodes = new ArrayList<>();
            depth ++;
            // 遍历每层的节点
           for (TreeNode node:arrayList) {
               // 如果子节点两边都是空的，就直接跳出说明这个深度最小
               if (node.left == null && node.right == null) {
                   return depth;
               }
               if (node.right != null) {
                   treeNodes.add(node.right);
               }
               if (node.left != null) {
                   treeNodes.add(node.left);
               }

           }
            arrayList = treeNodes;

        }
    }

}
