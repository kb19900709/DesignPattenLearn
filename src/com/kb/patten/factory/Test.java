package com.kb.patten.factory;

import com.kb.patten.factory.constant.TeaEnum;
import com.kb.patten.factory.creator.DrinkStore;
import com.kb.patten.factory.creator.store.ChingShin;
import com.kb.patten.factory.creator.store.FiftyLan;

public class Test {
	public static void main(String[] args) {
		DrinkStore fiftyLan = new FiftyLan();
		fiftyLan.orderDrink(TeaEnum.BLACK_TEA);

		DrinkStore chingShin = new ChingShin();
		chingShin.orderDrink(TeaEnum.GREEN_TEA);

	}
}
