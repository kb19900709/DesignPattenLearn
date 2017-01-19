package com.kb.patten.observer.subject;

import com.kb.patten.observer.observer.DiGer;

public interface FbFans {

	/**
	 * 通知追蹤者
	 */
	void notifyObserver();

	/**
	 * 註冊使用者
	 * 
	 * @param diGer
	 */
	void registerObserver(DiGer diGer);

	/**
	 * 移除使用者
	 * 
	 * @param diGer
	 */
	void removeObserver(DiGer diGer);

}
