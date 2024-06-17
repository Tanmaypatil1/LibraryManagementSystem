package com.wipro.ass1;
import java.util.LinkedList;

	public class ShoppingApp {

	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();
	        PurchaseHistory history = new PurchaseHistory();
	        CustomerService service = new CustomerService();

	      
	        cart.addItem("Grapes");
	        cart.addItem("Cherry");
	        cart.viewCart();
	       
	        history.saveCart(cart.getCart());
	        cart = new ShoppingCart(); 
	        
	        cart.addItem("Mangoes");
	        cart.viewCart();
	        history.saveCart(cart.getCart());
	        history.viewHistory();

	        LinkedList<String> lastCart = history.undoLastPurchase();
	        System.out.println("Last purchase cart: " + lastCart);

	        service.addRequest("Request 1");
	        service.addRequest("Request 2");
	        service.viewPendingRequests();
	        System.out.println("Processing request: " + service.processRequest());
	        service.viewPendingRequests();
	    }
	}

