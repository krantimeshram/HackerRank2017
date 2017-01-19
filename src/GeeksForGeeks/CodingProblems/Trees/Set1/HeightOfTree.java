package GeeksForGeeks.CodingProblems.Trees.Set1;

import GeeksForGeeks.CodingProblems.Trees.BinaryTree;
import GeeksForGeeks.CodingProblems.Trees.TreeNode;

/**
 * Created by Nikhil on 1/17/2017 8:53 PM.
 */
public class HeightOfTree {
    private static int heightOfTree(TreeNode node){
        if(node == null) return 0;
        if(node.left == null && node.right==null) return 1;
        return 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));
    }

    public static void main(String[] args) {
        BinaryTree tree = ConstructBST.constructBST();

        int height = heightOfTree(tree.getRoot());
        System.out.println(height);

    }
}