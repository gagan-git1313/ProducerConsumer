package com.test.entity;

public class Company {
	private int item = 0;
	public boolean chance = true;

	synchronized public void produceItem(int i) {
		if (!chance) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.item = i;
		System.out.println("Produced Item: " + item);
		chance = false;
		notify();
	}

	synchronized public int consumeItem() {
		if (chance) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		System.out.println("Consumed Item: " + item);
		chance = true;
		notify();
		return this.item;
	}
}
