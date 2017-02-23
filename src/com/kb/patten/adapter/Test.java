package com.kb.patten.adapter;

import com.kb.patten.adapter.impl.AndroidProgram;
import com.kb.patten.adapter.impl.IosAdapter;
import com.kb.patten.adapter.impl.IosProgram;
import com.kb.patten.adapter.os.Android;
import com.kb.patten.adapter.os.Ios;

public class Test {
	public static void main(String[] args) {
		// 一般 IOS 實作
		Ios iosProgram = new IosProgram();
		iosProgram.useSwiftProgram();
		iosProgram.build();
		iosProgram.linkAppleStore();

		System.out.println("\n###中場休息時間###\n");

		// 一般 Android 實作
		Android androidProgram = new AndroidProgram();
		androidProgram.useJavaProgram();
		androidProgram.build();

		System.out.println("\n###中場休息時間###\n");

		// Android 使用 IOS 轉接器
		Ios iosAdapter = new IosAdapter(androidProgram);
		iosAdapter.useSwiftProgram();
		iosAdapter.build();
		iosAdapter.linkAppleStore();
	}
}
