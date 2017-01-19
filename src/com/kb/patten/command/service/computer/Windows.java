package com.kb.patten.command.service.computer;

public class Windows implements Computer {

	@Override
	public void doSomething() {
		System.out.println("用一般電腦玩電動");
	}

	@Override
	public void off() {
		System.out.println("關閉一般電腦");
	}

	@Override
	public void on() {
		System.out.println("打開一般電腦");
	}

}
