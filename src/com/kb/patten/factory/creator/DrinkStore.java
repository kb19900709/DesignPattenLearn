package com.kb.patten.factory.creator;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.product.drinks.Drink;

/**
 * 抽象飲料店
 * 
 * @author KB
 * @version 1.0
 */
public abstract class DrinkStore {

	/**
	 * 飲料下單
	 * 
	 * @param teaEnum
	 */
	public void orderDrink(TeaEnum teaEnum) {
		Drink drink = createDrink(getStoreName(), teaEnum);
		drink.prepare();
		drink.create();
		drink.charge();
	}

	/**
	 * 建立飲料
	 * 
	 * @param storeName
	 * @param teaEnum
	 * @return
	 */
	protected abstract Drink createDrink(String storeName, TeaEnum teaEnum);

	/**
	 * 取得商店名稱
	 * 
	 * @return
	 */
	protected abstract String getStoreName();
}
