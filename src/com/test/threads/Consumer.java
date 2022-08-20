package com.test.threads;

import com.test.entity.Company;

public class Consumer extends Thread{
	Company c;
	
	public Consumer(Company c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	
	
	public void run(){
		// TODO Auto-generated method stub
		
		while(true) {
			
				
			this.c.consumeItem();
			
		try {	Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
