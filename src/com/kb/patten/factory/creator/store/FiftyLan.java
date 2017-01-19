package com.kb.patten.factory.creator.store;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.DrinkStore;
import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.creator.provider.FlProvider;
import com.kb.patten.factory.product.drinks.Drink;
import com.kb.patten.factory.product.drinks.fl.FlBlackTea;
import com.kb.patten.factory.product.drinks.fl.FlGreenTea;
import com.kb.patten.factory.product.drinks.fl.FlMilkTea;

/**
 * 五十嵐
 * 
 * @author KB
 * @version 1.0
 */
public class FiftyLan extends DrinkStore {

	private MaterialProvider provider = new FlProvider();

	@Override
	protected Drink createDrink(String storeName, TeaEnum teaEnum) {
		Drink result = null;
		switch (teaEnum) {
		case BLACK_TEA:
			result = new FlBlackTea(storeName, teaEnum, provider);
			break;
		case GREEN_TEA:
			result = new FlGreenTea(storeName, teaEnum, provider);
			break;
		case MILK_TEA:
			result = new FlMilkTea(storeName, teaEnum, provider);
			break;
		}
		return result;
	}

	@Override
	protected String getStoreName() {
		return "五十嵐";
	}

}
