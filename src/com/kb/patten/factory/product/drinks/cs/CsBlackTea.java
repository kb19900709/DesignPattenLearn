package com.kb.patten.factory.product.drinks.cs;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.product.drinks.Drink;

/**
 * 清心福泉紅茶
 * 
 * @author KB
 * @version 1.0
 */
public class CsBlackTea extends Drink {

	public CsBlackTea(String storeName, TeaEnum teaEnum, MaterialProvider provider) {
		super(storeName, teaEnum, provider);
	}

	@Override
	public void injectMaterial() {
		setPearl(provider.getPearl());
		setSpices(provider.getSpices());
	}

}
