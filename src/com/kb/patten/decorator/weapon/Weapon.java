package com.kb.patten.decorator.weapon;

/**
 * 武器
 * 
 * @author KB
 * @version 1.0
 */
public abstract class Weapon {

	/**
	 * 取得攻擊點數
	 * 
	 * @return
	 */
	public abstract int attack();

	/**
	 * 裝備描述
	 * 
	 * @return
	 */
	public abstract String desc();
}
