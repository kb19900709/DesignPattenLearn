package com.kb.patten.template.main;

/**
 * 上班族的生活樣板
 * 
 * @author KB
 * @version 1.0
 */
public abstract class LifeTemplate {

	public LifeTemplate(String myName) {
		System.out.println(String.format("大家好我是 %s，this is my life", myName));
	}

	/**
	 * <pre>
	 * Template method
	 * final 修飾使得子類別無法再複寫。
	 * </pre>
	 */
	public final void templateLife() {
		// 是否請假
		if (!isLeave()) {
			goCompany();
			work();
			goHome();
		} else {
			System.out.println("今天請假唷");
		}
		eat();
		play();
	}

	/**
	 * final 修飾使得子類別無法再複寫。
	 */
	private final void eat() {
		System.out.println("大家都得吃飯");
	}

	private void work() {
		System.out.println("大家都得無聊的上班");
	}

	/**
	 * 怎麼去公司交給子類別實作
	 */
	protected abstract void goCompany();

	/**
	 * 怎麼回家交給子類別實作
	 */
	protected abstract void goHome();

	/**
	 * <pre>
	 * Hook method
	 * 是否請假，預設值為否，並沒有透過 abstract 修飾強迫子類別實作。
	 * 但可以透過 Override 的方式改變回傳值，更改原本 template method 的預設行為。
	 * </pre>
	 * 
	 * @return
	 */
	protected boolean isLeave() {
		return false;
	}

	/**
	 * 在吃完飯之後如何玩耍交給子類別決定
	 */
	protected abstract void play();
}
