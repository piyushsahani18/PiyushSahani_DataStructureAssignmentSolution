package com.greatlearning.model;

public class TransactionNode {

	int transactiondata;
	TransactionNode left;
	TransactionNode right;
	TransactionNode node;
	
	public TransactionNode( int transactiondata) {
		this.transactiondata = transactiondata;
		this.left = null;
		this.right = null;
	}

	// Getters & Setters
	public int getTransactiondata() {
		return transactiondata;
	}

	public void setTransactiondata(int transactiondata) {
		this.transactiondata = transactiondata;
	}

	public TransactionNode getLeft() {
		return left;
	}

	public void setLeft(TransactionNode left) {
		this.left = left;
	}

	public TransactionNode getRight() {
		return right;
	}

	public void setRight(TransactionNode right) {
		this.right = right;
	}
}
