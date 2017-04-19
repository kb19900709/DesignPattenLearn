package com.kb.patten.composite.company;

import java.util.Iterator;

import com.kb.patten.composite.employee.Employee;
import com.kb.patten.composite.main.Node;

public abstract class Company extends Node {
	public abstract void addEmployee(Employee employee);

	@Override
	public abstract Iterator<? extends Node> getNodeIterator();

	@Override
	public abstract void printInfo();

	public abstract void removeEmployee(Employee employee);
}
