package com.greatlearning.service;

import com.greatlearning.model.TransactionNode;

public class SkewTreeConversion {
	
	 TransactionNode prev = null;
	 public TransactionNode head = null;

    
     // As the tree is BST The order of the  nodes will be in increasing order for Inorder-operation
    public void BstToSkewTree(TransactionNode root) {

        // Base Case
        if (root == null) {
            return;
        }

        BstToSkewTree(root.getLeft());
        TransactionNode rightNode = root.getRight();
       // Operation to convert the BST to skew binary tree.
        if (head == null) {
            head = root;
            root.setLeft(null);
            prev = root;
        } else {
            prev.setRight(root);
            root.setLeft(null);
            prev = root;
        }
        
        BstToSkewTree(rightNode);
    }

    
    // Function to traverse through the right-skew binary tree
    public void traverseRightSkewed(TransactionNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getTransactiondata()+ " ");
        traverseRightSkewed(root.getRight());
    }
	
	

}
