package com.kb.patten.command.service.computer;

public class MacBook implements Computer {

	@Override
	public void doSomething() {
		System.out.println("用 MacBook coding");
	}

	@Override
	public void off() {
		System.out.println("關閉 MacBook");
	}

	@Override
	public void on() {
		System.out.println("打開 MacBook");
	}

}
