package com.kb.patten.factory.creator.provider;

import com.kb.patten.factory.creator.MaterialProvider;
import com.kb.patten.factory.product.material.Pearl;
import com.kb.patten.factory.product.material.Spices;
import com.kb.patten.factory.product.material.cs.CsPearl;
import com.kb.patten.factory.product.material.cs.CsSpices;

/**
 * 清心福全原料提供者
 * 
 * @author KB
 * @version 1.0
 */
public class CsProvider implements MaterialProvider {

	@Override
	public Pearl getPearl() {
		return new CsPearl();
	}

	@Override
	public Spices getSpices() {
		return new CsSpices();
	}

}
