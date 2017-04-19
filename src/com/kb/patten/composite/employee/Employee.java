package com.kb.patten.composite.employee;

import java.util.Iterator;
import java.util.List;

import com.kb.patten.composite.company.Company;
import com.kb.patten.composite.main.Node;

public abstract class Employee extends Node {

	@Override
	public abstract Iterator<? extends Node> getNodeIterator();

	@Override
	public abstract void printInfo();

	public abstract void registryCompany(Class<? extends Company> company);

	@Override
	public abstract void setNodeList(List<? extends Node> nodeList);
}
