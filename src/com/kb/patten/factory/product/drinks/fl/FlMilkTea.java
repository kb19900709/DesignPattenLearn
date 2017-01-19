package com.kb.patten.factory.product.drinks.fl;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.product.drinks.Drink;

/**
 * 五十嵐奶茶
 * 
 * @author KB
 * @version 1.0
 */
public class FlMilkTea extends Drink {

	public FlMilkTea(String storeName, TeaEnum teaEnum, MaterialProvider provider) {
		super(storeName, teaEnum, provider);
	}

	@Override
	public void injectMaterial() {
		setPearl(provider.getPearl());
		setSpices(provider.getSpices());
	}

}
