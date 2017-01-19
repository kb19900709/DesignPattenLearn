package com.kb.patten.factory.creator;

import com.kb.patten.factory.product.material.Pearl;
import com.kb.patten.factory.product.material.Spices;

/**
 * 原料供應介面
 * 
 * @author KB
 * @version 1.0
 */
public interface MaterialProvider {
	Pearl getPearl();

	Spices getSpices();
}
