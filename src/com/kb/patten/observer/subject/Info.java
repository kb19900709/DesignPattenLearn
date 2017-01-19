package com.kb.patten.observer.subject;

import java.util.List;

public interface Info {
	/**
	 * 取得歷史資訊
	 * 
	 * @return
	 */
	List<String> getHistoryMessageList();

	/**
	 * 取得最新資訊
	 * 
	 * @return
	 */
	String getLastMessage();
}
