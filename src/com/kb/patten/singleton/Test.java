package com.kb.patten.singleton;

import com.kb.patten.singleton.main.SingletonService;

public class Test {
	public static void main(String[] args) {
		SingletonService task1 = SingletonService.getInstance();
		task1.getInfo();

		new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonService task2 = SingletonService.getInstance();
				task2.getInfo();
			}
		}).run();
	}
}
