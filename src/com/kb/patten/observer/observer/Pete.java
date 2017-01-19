package com.kb.patten.observer.observer;

import com.kb.patten.observer.subject.Info;

public class Pete implements DiGer {

	public Pete() {
		playPs4();
	}

	public void playPs4() {
		System.out.println(String.format("%s,%s", getClass().getSimpleName(), "最愛ps4"));
	}

	@Override
	public void updateInfo(Info info) {
		System.out.println(String.format("%s 覺得 %s 的貼文很讚 ... %s", getClass().getSimpleName(),
				info.getClass().getSimpleName(), info.getLastMessage()));
	}
}
