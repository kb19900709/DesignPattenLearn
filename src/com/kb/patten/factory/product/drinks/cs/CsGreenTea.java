package com.kb.patten.factory.product.drinks.cs;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.product.drinks.Drink;

/**
 * 清心福泉綠茶
 * 
 * @author KB
 * @version 1.0
 */
public class CsGreenTea extends Drink {

	public CsGreenTea(String storeName, TeaEnum teaEnum, MaterialProvider provider) {
		super(storeName, teaEnum, provider);
	}

	@Override
	public void injectMaterial() {
		setPearl(provider.getPearl());
		setSpices(provider.getSpices());
	}
}
