package com.kb.patten.proxy.main;

import java.lang.reflect.Proxy;

public class ThinkPowerCompany {

	static class ProgramerImpl implements Programer {

		private static Programer genProgramer(String name) {
			ProgramerImpl pg = new ProgramerImpl(name);
			Object object = Proxy.newProxyInstance(
					pg.getClass().getClassLoader(),
					pg.getClass().getInterfaces(), ProductManager.register(pg));
			return (Programer) object;
		}

		private String name;

		private ProgramerImpl(String name) {
			this.name = name;
		}

		@Override
		public void fixedIssue() {
			System.out.println("身為一個程式設計師負責解決問題是很合理的事情");
		}

		@Override
		public void getName() {
			System.out.println(String.format("My name is %s", name));
		}
	}

	public static Programer getProgramer(String name) {
		return ProgramerImpl.genProgramer(name);
	}
}
