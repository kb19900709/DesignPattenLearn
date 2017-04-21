package com.kb.patten.composite.employee;

import java.util.Iterator;
import java.util.List;

import com.kb.patten.composite.company.Company;
import com.kb.patten.composite.main.Node;

/**
 * 員工型別
 * 
 * @author KB
 * @version 1.0
 */
public abstract class Employee extends Node {

	@Override
	public abstract Iterator<? extends Node> getNodeIterator();

	@Override
	public abstract void printInfo();

	/**
	 * 註冊公司資訊
	 * 
	 * @param company
	 */
	public abstract void registryCompany(Class<? extends Company> company);

	@Override
	public abstract void setNodeList(List<? extends Node> nodeList);
}
