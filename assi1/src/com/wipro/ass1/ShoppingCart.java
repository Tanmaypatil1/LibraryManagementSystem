package com.wipro.ass1;

	import java.util.LinkedList;

	public class ShoppingCart {
	    private LinkedList<String> cart;

	    public ShoppingCart() {
	        cart = new LinkedList<>();
	    }

	    public void addItem(String item) {
	        cart.add(item);
	    }

	    public void removeItem(String item) {
	        cart.remove(item);
	    }

	    public void viewCart() {
	        System.out.println("Items in the cart: " + cart);
	    }
	    
	    public LinkedList<String> getCart(){
	    	return cart;
	    }
	}
	
