package com.kb.patten.factory.creator.provider;

import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.product.material.Pearl;
import com.kb.patten.factory.product.material.Spices;
import com.kb.patten.factory.product.material.fl.FlPearl;
import com.kb.patten.factory.product.material.fl.FlSpices;

/**
 * 五十嵐原料提供者
 * 
 * @author KB
 * @version 1.0
 */
public class FlProvider implements MaterialProvider {

	@Override
	public Pearl getPearl() {
		return new FlPearl();
	}

	@Override
	public Spices getSpices() {
		return new FlSpices();
	}

}
