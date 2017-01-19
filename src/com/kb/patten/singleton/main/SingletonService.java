package com.kb.patten.singleton.main;

public class SingletonService {
	// 宣告 volatile 告知 JVM 此為不穩定變數，每次使用必須去 main memory 取出，而不是 thread private
	// working copy
	private static volatile SingletonService INSTANCE;

	public static SingletonService getInstance() {
		// double-checked locking
		if (INSTANCE == null) {
			synchronized (SingletonService.class) {
				if (INSTANCE == null) {
					System.out.println("create new instance");
					INSTANCE = new SingletonService();
				}
			}
		}
		return INSTANCE;
	};

	private SingletonService() {
	}

	public void getInfo() {
		System.out.println(this);
	}
}
