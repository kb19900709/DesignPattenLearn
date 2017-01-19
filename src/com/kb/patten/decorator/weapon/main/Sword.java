package com.kb.patten.decorator.weapon.main;

import com.kb.patten.decorator.weapon.Weapon;

/**
 * 直劍
 * 
 * @author KB
 * @version 1.0
 */
public class Sword extends Weapon {

	@Override
	public int attack() {
		return 30;
	}

	@Override
	public String desc() {
		return "直劍";
	}

}
