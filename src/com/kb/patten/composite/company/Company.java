package com.kb.patten.composite.company;

import java.util.Iterator;

import com.kb.patten.composite.employee.Employee;
import com.kb.patten.composite.main.Node;

/**
 * 公司型別
 * 
 * @author KB
 * @version 1.0
 */
public abstract class Company extends Node {
	/**
	 * 新增員工
	 * 
	 * @param employee
	 */
	public abstract void addEmployee(Employee employee);

	@Override
	public abstract Iterator<? extends Node> getNodeIterator();

	@Override
	public abstract void printInfo();

	/**
	 * 移除員工
	 * 
	 * @param employee
	 */
	public abstract void removeEmployee(Employee employee);
}
