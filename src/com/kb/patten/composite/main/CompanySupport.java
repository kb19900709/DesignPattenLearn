package com.kb.patten.composite.main;

import java.util.Iterator;
import java.util.List;

import com.kb.patten.composite.company.Company;

/**
 * Company 的資訊服務
 * 
 * @author KB
 * @version 1.0
 * @see com.kb.patten.composite.company.Company
 */
public class CompanySupport {

	/**
	 * 以公司為單位印出員工
	 * 
	 * @param company
	 */
	public static void print(Company company) {
		Iterator<? extends Node> nodeIterator = company.getNodeIterator();
		Node node;
		while (nodeIterator.hasNext()) {
			node = nodeIterator.next();
			node.printInfo();
		}
	}

	public static void printAllCompanyEmployee(List<Company> companyGroup) {
		for (Company company : companyGroup) {
			print(company);
		}
	}
}
