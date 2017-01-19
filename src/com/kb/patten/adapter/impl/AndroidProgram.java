package com.kb.patten.adapter.impl;

import com.kb.patten.adapter.os.Android;

public class AndroidProgram implements Android {

	@Override
	public void build() {
		System.out.println("打包 Android 專案");
	}

	@Override
	public void useJavaProgram() {
		System.out.println("使用 Java 建立底層系統");
	}

}
