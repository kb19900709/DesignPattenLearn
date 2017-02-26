package com.kb.patten.adapter.impl;

import com.kb.patten.adapter.os.Android;
import com.kb.patten.adapter.os.Ios;

/**
 * IOS 開發轉接器，由 Android 自行研發
 * 
 * @author KB
 * @version 1.0
 */
public class IosAdapter implements Ios {

	Android androidProgram;

	public IosAdapter(Android androidProgram) {
		this.androidProgram = androidProgram;
		System.out.println("使用 Ios 轉接器，Android 偷偷潛入了 Ios 系統");
	}

	@Override
	public void build() {
		androidProgram.build();
	}

	@Override
	public void linkAppleStore() {
		// 不支援的 API 拋出錯誤
		throw new UnsupportedOperationException("使用 Ios 轉接器，無法使用 apple store");
	}

	@Override
	public void useSwiftProgram() {
		androidProgram.useJavaProgram();
	}

}
