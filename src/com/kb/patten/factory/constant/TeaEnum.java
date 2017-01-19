package com.kb.patten.factory.constant;

/**
 * 各類茶飲
 * 
 * @author KB
 * @version 1.0
 */
public enum TeaEnum {
	BLACK_TEA("紅茶"), GREEN_TEA("綠茶"), MILK_TEA("奶茶");

	private String desc;

	private TeaEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
