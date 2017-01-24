package com.kb.patten.adapter.impl;

import com.kb.patten.adapter.os.Ios;

public class IosProgram implements Ios {

	@Override
	public void build() {
		System.out.println("打包 Ios 專案");
	}

	@Override
	public void linkAppleStore() {
		System.out.println("APP 打包送審至 apple store");
	}

	@Override
	public void useSwiftProgram() {
		System.out.println("使用 Swift 建立底層系統");
	}

}
