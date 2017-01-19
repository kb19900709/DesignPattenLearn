package com.kb.patten.decorator.weapon;

/**
 * 武器裝飾品抽象類別
 * 
 * @author KB
 * @version 1.0
 */
public abstract class WeaponDecorator extends Weapon {
	protected Weapon wrapTarget;

	public WeaponDecorator(Weapon wrapTarget) {
		this.wrapTarget = wrapTarget;
	}
}
