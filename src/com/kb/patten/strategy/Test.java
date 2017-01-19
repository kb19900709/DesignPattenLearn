package com.kb.patten.strategy;

import com.kb.patten.strategy.behavior.favorite.Chicken;
import com.kb.patten.strategy.behavior.talent.CatchBall;
import com.kb.patten.strategy.main.Dog;
import com.kb.patten.strategy.main.Husky;

public class Test {

	public static void main(String[] args) {
		// 有一隻哈士奇叫做 KB
		Dog dog = new Husky("KB");
		System.out.println(String.format("我的名字是 %s ,品種是 %s", dog.getName(), dog.getVariety()));
		dog.showTalent();
		dog.exposeFavoriteFood();

		System.out.println("***** 執行時期改變行為 *****");
		dog.setTalent(new CatchBall());
		dog.setFavorite(new Chicken());

		dog.showTalent();
		dog.exposeFavoriteFood();
	}

}
