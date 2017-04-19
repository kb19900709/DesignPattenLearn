package com.kb.patten.composite.main;

import java.util.ArrayList;
import java.util.List;

import com.kb.patten.composite.employee.Employee;
import com.kb.patten.composite.employee.EmployeeImpl;

public class EmployeeGenerator {
	public static List<Employee> genEmployee() {
		List<Employee> result = new ArrayList<>();
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("KB", 5000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Rick", 6000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Pete", 7000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Normen", 8000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("David", 9000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Annie", 10000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Yuni", 11000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Owne", 12000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Anson", 13000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Chad", 14000));
		return result;
	}

	public static List<Employee> genKbMember() {
		List<Employee> result = new ArrayList<>();
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Hendry", 5000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Jello", 6000));
		result.add(EmployeeImpl.genEmployeeByNameAndSalary("Carter", 7000));
		return result;
	}
}
