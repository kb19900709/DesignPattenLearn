package com.kb.patten.decorator.weapon.decorator;

import com.kb.patten.decorator.weapon.Weapon;
import com.kb.patten.decorator.weapon.WeaponDecorator;

/**
 * 藍寶石
 * 
 * @author KB
 * @version 1.0
 */
public class Sapphire extends WeaponDecorator {

	private final static int ATTACK_VALUE = 3;

	public Sapphire(Weapon wrapTarget) {
		super(wrapTarget);
	}

	@Override
	public int attack() {
		return ATTACK_VALUE + wrapTarget.attack();
	}

	@Override
	public String desc() {
		return String.format("%s/%s", "多聞的", wrapTarget.desc());
	}
}
