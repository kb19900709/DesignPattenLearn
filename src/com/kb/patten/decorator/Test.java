package com.kb.patten.decorator;

import com.kb.patten.decorator.weapon.Weapon;
import com.kb.patten.decorator.weapon.decorator.Ruby;
import com.kb.patten.decorator.weapon.decorator.Sapphire;
import com.kb.patten.decorator.weapon.main.Sword;

public class Test {

	public static void main(String[] args) {
		// 一個裝了藍寶石以及紅寶石的劍
		Weapon weapon = new Sapphire(new Ruby(new Sword()));

		System.out.println(String.format("攻擊：%s", weapon.attack()));
		System.out.println(String.format("武器簡述：%s", weapon.desc()));
	}

}
