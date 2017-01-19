package com.kb.patten.factory.product.drinks;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.product.material.Pearl;
import com.kb.patten.factory.product.material.Spices;

/**
 * 抽象飲料
 * 
 * @author KB
 * @version 1.0
 */
public abstract class Drink {

	/**
	 * 商店名稱
	 */
	private String markName;

	/**
	 * 珍珠
	 */
	private Pearl pearl;

	/**
	 * 香料
	 */
	private Spices spices;

	/**
	 * 原料提供者
	 */
	protected MaterialProvider provider;

	public Drink(String storeName, TeaEnum teaEnum, MaterialProvider provider) {
		this.markName = String.format("%s-%s", storeName, teaEnum.getDesc());
		this.provider = provider;
	}

	/**
	 * 收費
	 */
	public void charge() {
		System.out.println(String.format("%s %s", markName, "收費"));
	}

	/**
	 * 製作飲料
	 */
	public void create() {
		System.out.println(String.format("%s %s", markName, "製作飲料"));
	}

	public Pearl getPearl() {
		return pearl;
	}

	public Spices getSpices() {
		return spices;
	}

	/**
	 * 注入原料
	 */
	public abstract void injectMaterial();

	/**
	 * 準備原料
	 */
	public void prepare() {
		System.out.println(String.format("%s %s", markName, "準備原料"));
		injectMaterial();
	}

	public void setPearl(Pearl pearl) {
		this.pearl = pearl;
	}

	public void setSpices(Spices spices) {
		this.spices = spices;
	}
}
