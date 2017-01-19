package com.kb.patten.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.kb.patten.observer.observer.DiGer;

public class Angelababy implements FbFans, Info {

	// 豬哥列表
	private List<DiGer> deGerList;

	// 歷史資訊紀錄
	private List<String> historyMessageList;

	// 最新資訊
	private String lastMessage;

	public Angelababy() {
		deGerList = new ArrayList<>();
		historyMessageList = new ArrayList<>();
		System.out.println(String.format("大家好，我是 %s (水噹噹)", getClass().getSimpleName()));
	}

	@Override
	public List<String> getHistoryMessageList() {
		return this.getHistoryMessageList();
	}

	@Override
	public String getLastMessage() {
		return this.lastMessage;
	}

	@Override
	public void notifyObserver() {
		for (DiGer d : deGerList) {
			d.updateInfo(this);
		}
	}

	@Override
	public void registerObserver(DiGer diGer) {
		deGerList.add(diGer);
		System.out.println(String.format("此豬哥追蹤了我的粉絲專頁 : %s", diGer.getClass().getSimpleName()));
	}

	@Override
	public void removeObserver(DiGer diGer) {
		if (diGer != null) {
			int index = deGerList.indexOf(diGer);
			if (index >= 0) {
				deGerList.remove(diGer);
				System.out.println(String.format("此豬哥離開了我的粉絲專頁 : %s", diGer.getClass().getSimpleName()));
			}
		}
	}

	/**
	 * 發文
	 * 
	 * @param lastMessage
	 */
	public void updateLastMessage(String lastMessage) {
		if (lastMessage == null) {
			return;
		}

		synchronized (this) {
			this.lastMessage = lastMessage;
			historyMessageList.add(lastMessage);
			System.out.println(String.format("%s 有話要說 ... %s", getClass().getSimpleName(), lastMessage));
			notifyObserver();
		}
	}
}
