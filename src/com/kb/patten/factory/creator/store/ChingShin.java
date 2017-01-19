package com.kb.patten.factory.creator.store;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.DrinkStore;
import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.creator.provider.CsProvider;
import com.kb.patten.factory.product.drinks.Drink;
import com.kb.patten.factory.product.drinks.cs.CsBlackTea;
import com.kb.patten.factory.product.drinks.cs.CsGreenTea;
import com.kb.patten.factory.product.drinks.cs.CsMilkTea;

/**
 * 清心福全
 * 
 * @author KB
 * @version 1.0
 */
public class ChingShin extends DrinkStore {

	private MaterialProvider provider = new CsProvider();

	@Override
	protected Drink createDrink(String storeName, TeaEnum teaEnum) {
		Drink result = null;
		switch (teaEnum) {
		case BLACK_TEA:
			result = new CsBlackTea(storeName, teaEnum, provider);
			break;
		case GREEN_TEA:
			result = new CsGreenTea(storeName, teaEnum, provider);
			break;
		case MILK_TEA:
			result = new CsMilkTea(storeName, teaEnum, provider);
			break;
		}
		return result;
	}

	@Override
	protected String getStoreName() {
		return "清心福全";
	}

}
