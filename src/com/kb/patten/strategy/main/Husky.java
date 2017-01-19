package com.kb.patten.strategy.main;

import com.kb.patten.strategy.behavior.favorite.Beef;
import com.kb.patten.strategy.behavior.talent.ShakeHands;

public class Husky extends Dog {

	public Husky(String name) {
		setName(name);

		// default behavior
		setTalent(new ShakeHands());

		// default favorite
		setFavorite(new Beef());
	}

	@Override
	public String getVariety() {
		return "哈士奇";
	}

}
