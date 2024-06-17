package com.wipro.ass1;

	import java.util.LinkedList;
	import java.util.Queue;

	public class CustomerService {
	    private Queue<String> serviceRequests;

	    public CustomerService() {
	        serviceRequests = new LinkedList<>();
	    }

	    public void addRequest(String request) {
	        serviceRequests.add(request);
	    }

	    public String processRequest() {
	        return serviceRequests.poll();
	    }

	    public void viewPendingRequests() {
	        System.out.println("Pending requests: " + serviceRequests);
	    }
	}
	
	
