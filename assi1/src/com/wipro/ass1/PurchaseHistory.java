package com.wipro.ass1;

	import java.util.LinkedList;
	import java.util.Stack;

	public class PurchaseHistory {
	    private Stack<LinkedList<String>> history;

	    public PurchaseHistory() {
	        history = new Stack<>();
	    }

	    public void saveCart(LinkedList<String> cart) {
	        history.push(new LinkedList<>(cart));
	    }

	    public LinkedList<String> undoLastPurchase() {
	        if (!history.isEmpty()) {
	            return history.pop();
	        }
	        return null;
	    }

	    public void viewHistory() {
	        System.out.println("Purchase history: " + history);
	    }
	}
	
	
	

