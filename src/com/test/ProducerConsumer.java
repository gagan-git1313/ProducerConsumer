package com.test;

import com.test.entity.Company;
import com.test.threads.Consumer;
import com.test.threads.Producer;

public class ProducerConsumer {
	public static void main(String[] args) {
		Company c = new Company();
		Producer producer = new Producer(c);
		Consumer consumer = new Consumer(c);
		producer.start();
		consumer.start();
	}
}
