package com.greatlearning.main;

import com.greatlearning.model.TransactionNode;
import com.greatlearning.service.SkewTreeConversion;

public class Driver {
	TransactionNode node;
	Driver() {
        root = null;
    }

	public static void main(String[] args) {

		Driver tree = new Driver();
		tree.node = new TransactionNode(50);
		tree.node.setLeft(new TransactionNode(30));
		tree.node.setRight(new TransactionNode(60));
		tree.node.getLeft().setLeft(new TransactionNode(10));
		tree.node.getRight().setLeft(new TransactionNode(55));
		SkewTreeConversion skewTreeConversion = new SkewTreeConversion();
		skewTreeConversion.BstToSkewTree(tree.node);
		skewTreeConversion.traverseRightSkewed(skewTreeConversion.head);
	}
}
