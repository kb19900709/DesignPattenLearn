package com.kb.patten.composite.main;

import java.util.Iterator;
import java.util.List;

import com.kb.patten.composite.company.Company;

public class CompanySupport {

	public static void print(Company company) {
		Iterator<? extends Node> nodeIterator = company.getNodeIterator();
		Node node;
		while (nodeIterator.hasNext()) {
			node = nodeIterator.next();
			node.printInfo();
		}
	}

	private List<Company> companyGroup;

	public CompanySupport(List<Company> companyGroup) {
		this.companyGroup = companyGroup;
	}

	public void printAllCompanyEmployee() {
		for (Company company : companyGroup) {
			print(company);
		}
	}
}
