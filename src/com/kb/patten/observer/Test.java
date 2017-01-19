package com.kb.patten.observer;

import com.kb.patten.observer.observer.Pete;
import com.kb.patten.observer.observer.Rick;
import com.kb.patten.observer.subject.Angelababy;

public class Test {

	public static void main(String[] args) {
		// FB 上的 Angelababy
		Angelababy baby = new Angelababy();
		// baby 第一次發文
		baby.updateLastMessage("覺得冷");

		Pete p = new Pete();
		// Pete 追蹤了 baby
		baby.registerObserver(p);

		// baby 第二次發文
		baby.updateLastMessage("覺得熱");

		Rick r = new Rick();
		// Rick 追蹤了 baby
		baby.registerObserver(r);

		// baby 第三次發文
		baby.updateLastMessage("覺得想");

		// Rick 取消追蹤了 baby
		baby.removeObserver(r);

		// baby 第四次發文
		baby.updateLastMessage("一群豬哥，呵呵");
	}

}
