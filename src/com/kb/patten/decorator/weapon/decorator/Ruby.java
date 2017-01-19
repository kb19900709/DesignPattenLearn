package com.kb.patten.decorator.weapon.decorator;

import com.kb.patten.decorator.weapon.Weapon;
import com.kb.patten.decorator.weapon.WeaponDecorator;

/**
 * 紅寶石
 * 
 * @author KB
 * @version 1.0
 */
public class Ruby extends WeaponDecorator {

	private final static int ATTACK_VALUE = 5;

	public Ruby(Weapon wrapTarget) {
		super(wrapTarget);
	}

	@Override
	public int attack() {
		return ATTACK_VALUE + wrapTarget.attack();
	}

	@Override
	public String desc() {
		return String.format("%s/%s", "憤怒的", wrapTarget.desc());
	}
}
