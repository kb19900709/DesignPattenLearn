package com.kb.patten.proxy;

import com.kb.patten.proxy.main.Programer;
import com.kb.patten.proxy.main.ThinkPowerCompany;

public class Test {
	public static void main(String[] args) {
		Programer pg = ThinkPowerCompany.getProgramer("KB");
		pg.getName();
		System.out.println("****************************************");
		pg.fixedIssue();
	}
}
