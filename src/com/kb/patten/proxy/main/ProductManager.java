package com.kb.patten.proxy.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProductManager implements InvocationHandler {

	public static ProductManager register(Programer pg) {
		return new ProductManager(pg);
	}

	private Programer pg;

	private ProductManager(Programer pg) {
		this.pg = pg;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (method.isAnnotationPresent(PmListener.class)) {
			System.out.println("ProductManager : 找程式設計師解決問題記得要先經過 PM 同意哦!!");
		}
		return method.invoke(pg, args);
	}
}
