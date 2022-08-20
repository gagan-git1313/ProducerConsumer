package com.test.threads;

import com.test.entity.Company;

public class Producer extends Thread{
	Company c;
	int item=0;
	
	public Producer(Company c){
		this.c = c;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			item++;
			this.c.produceItem(item);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
