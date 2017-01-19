package com.kb.patten.observer.observer;

import com.kb.patten.observer.subject.Info;

public class Rick implements DiGer {

	public Rick() {
		learnEngilish();
	}

	public void learnEngilish() {
		System.out.println(String.format("%s,%s", getClass().getSimpleName(), "跟著我一起念 PPAP UN ~"));
	}

	@Override
	public void updateInfo(Info info) {
		System.out.println(String.format("%s 已加入收藏 ... %s", getClass().getSimpleName(), info.getLastMessage()));
	}

}
