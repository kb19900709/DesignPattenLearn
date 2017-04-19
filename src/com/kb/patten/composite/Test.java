package com.kb.patten.composite;

import java.util.Arrays;
import java.util.List;

import com.kb.patten.composite.company.Company;
import com.kb.patten.composite.company.Google;
import com.kb.patten.composite.company.Microsoft;
import com.kb.patten.composite.employee.Employee;
import com.kb.patten.composite.main.CompanySupport;
import com.kb.patten.composite.main.EmployeeGenerator;
import com.kb.patten.composite.main.Node;
import com.kb.patten.composite.main.NodeSupport;
import com.kb.patten.composite.main.RootNode;

public class Test {
	private static final int TEST_COMPOSITE = 2;
	private static final int TEST_ITERATOR_REMOVE = 1;
	private static final int TEST_ITERATOR_SIMPLE_PRINT = 0;
	private static final int TEST_MODE = 2;

	public static void main(String[] args) {
		switch (TEST_MODE) {
			case TEST_ITERATOR_SIMPLE_PRINT :
				simplePrintTest();
				break;
			case TEST_ITERATOR_REMOVE :
				removeFunctionTest();
				break;
			case TEST_COMPOSITE :
				nodePrintTest();
				break;
			default :
				throw new UnsupportedOperationException(
						"TEST_MODE IN (0,1,2) ,stupid");
		}
	}

	private static void nodePrintTest() {
		List<Employee> genEmployeeGroup = EmployeeGenerator.genEmployee();
		List<Employee> genKbMember = EmployeeGenerator.genKbMember();
		Employee KB = genEmployeeGroup.get(0);
		KB.setNodeList(genKbMember);

		Company google = new Google();
		Company microsoft = new Microsoft();
		Employee employee;
		for (int i = 0; i < genEmployeeGroup.size(); i++) {
			employee = genEmployeeGroup.get(i);
			if (i % 2 == 0) {
				google.addEmployee(employee);
			} else {
				try {
					microsoft.addEmployee(employee);
				} catch (Exception e) {
				}
			}
		}

		Node rootNode = new RootNode();
		rootNode.setNodeList(Arrays.asList(google, microsoft));
		NodeSupport.nodePrint(rootNode);
	}

	private static void removeFunctionTest() {
		List<Employee> genEmployeeGroup = EmployeeGenerator.genEmployee();
		Company microsoft = new Microsoft();
		Employee KB = genEmployeeGroup.get(0);
		Employee Rick = genEmployeeGroup.get(1);
		Employee Pete = genEmployeeGroup.get(2);

		microsoft.addEmployee(KB);
		microsoft.addEmployee(Rick);
		microsoft.addEmployee(Pete);

		CompanySupport.print(microsoft);

		System.out.println("********************");

		microsoft.removeEmployee(Rick);
		microsoft.removeEmployee(Pete);

		CompanySupport.print(microsoft);
	}

	private static void simplePrintTest() {
		List<Employee> genEmployeeGroup = EmployeeGenerator.genEmployee();
		Company google = new Google();
		Company microsoft = new Microsoft();
		Employee employee;
		for (int i = 0; i < genEmployeeGroup.size(); i++) {
			employee = genEmployeeGroup.get(i);
			if (i % 2 == 0) {
				google.addEmployee(employee);
			} else {
				try {
					microsoft.addEmployee(employee);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		CompanySupport companySupport = new CompanySupport(
				Arrays.asList(google, microsoft));
		companySupport.printAllCompanyEmployee();
	}
}
