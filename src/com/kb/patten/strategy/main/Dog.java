package com.kb.patten.strategy.main;

import com.kb.patten.strategy.behavior.favorite.Favorite;
import com.kb.patten.strategy.behavior.talent.Talent;

abstract public class Dog {
	// 喜歡的食物
	private Favorite favorite;
	// 名字
	private String name;
	// 可以表演的才藝
	private Talent talent;

	/**
	 * 揭露喜歡的食物
	 */
	public void exposeFavoriteFood() {
		if (favorite != null) {
			favorite.getFavoriteFood();
		}
	}

	public String getName() {
		return name;
	}

	/**
	 * 取得品種
	 * 
	 * @return
	 */
	abstract public String getVariety();

	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTalent(Talent talent) {
		this.talent = talent;
	}

	/**
	 * 表演才藝
	 */
	public void showTalent() {
		if (talent != null) {
			talent.showTalent();
		}
	}
}
