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
	// 測試合成模式
	private static final int TEST_COMPOSITE = 2;
	// 測試 itertor remove 是否正常
	private static final int TEST_ITERATOR_REMOVE = 1;
	// 測試 itertor 是否正常運作
	private static final int TEST_ITERATOR_SIMPLE_PRINT = 0;
	private static final int TEST_MODE = 0;

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
		// 產生一般員工
		List<Employee> genEmployeeGroup = EmployeeGenerator.genEmployee();
		// 產生 KB 的組員
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

		microsoft.removeEmployee(Rick);
		microsoft.removeEmployee(Pete);

		System.out.println("********************");

		CompanySupport.print(microsoft);
	}

	private static void simplePrintTest() {
		List<Employee> genEmployeeGroup = EmployeeGenerator.genEmployee();
		// 平均分配員工至兩間公司
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

		CompanySupport
				.printAllCompanyEmployee(Arrays.asList(google, microsoft));
	}
}
