package com.kb.patten.strategy.behavior.favorite;

public class Chicken implements Favorite {

	@Override
	public void getFavoriteFood() {
		System.out.println("最愛雞肉~~~");
	}

}
