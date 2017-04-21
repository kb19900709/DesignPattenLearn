package com.kb.patten.composite.employee;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.kb.patten.composite.company.Company;
import com.kb.patten.composite.main.Node;

public class EmployeeImpl extends Employee {

	public static Employee genEmployeeByNameAndSalary(String name, int salary) {
		return new EmployeeImpl(name, salary);
	}

	private String companyName;

	private String name;

	private List<? extends Node> nodeList;

	private int salary;

	private EmployeeImpl(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<? extends Node> getNodeIterator() {
		/**
		 * 若該員工底下沒有成員，則回傳空的 Iterator。這麼做的好處客戶端可以省去 null 判斷的麻煩。
		 */
		Iterator<? extends Node> result = Collections.EMPTY_LIST.iterator();
		if (nodeList != null) {
			result = nodeList.iterator();
		}
		return result;
	}

	@Override
	public void printInfo() {
		// 員工基本資訊
		System.out.println(
				String.format("My name : %s , company : %s , salary : %s", name,
						companyName, salary));

		// 員工的成員處理
		int count = 0;
		Iterator<? extends Node> nodeIterator = getNodeIterator();
		Node node;
		while (nodeIterator.hasNext()) {
			if (count == 0) {
				System.out.println("This is my member ...");
				System.out.println("********************");
			}
			node = nodeIterator.next();
			node.printInfo();
			count++;
		}
		if (count != 0) {
			System.out.println("********************");
		}
	}

	@Override
	public void registryCompany(Class<? extends Company> company) {
		this.companyName = company.getSimpleName();
	}

	@Override
	public void setNodeList(List<? extends Node> nodeList) {
		this.nodeList = nodeList;
	}
}
