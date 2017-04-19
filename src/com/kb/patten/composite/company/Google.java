package com.kb.patten.composite.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kb.patten.composite.employee.Employee;
import com.kb.patten.composite.main.Node;
import com.kb.patten.composite.main.NodeSupport;

public class Google extends Company {
	private List<Employee> employeeGroup = new ArrayList<>();

	@Override
	public void addEmployee(Employee employee) {
		employee.registryCompany(Google.class);
		employeeGroup.add(employee);
	}

	@Override
	public Iterator<? extends Node> getNodeIterator() {
		return employeeGroup.iterator();
	}

	@Override
	public void printInfo() {
		System.out.println("This is Google information...");
		System.out.println("********************************");
		NodeSupport.nodePrint(this);
	}

	@Override
	public void removeEmployee(Employee employee) {
		employeeGroup.remove(employee);
	}
}
