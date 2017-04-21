package com.kb.patten.composite.company;

import java.util.Iterator;

import com.kb.patten.composite.employee.Employee;
import com.kb.patten.composite.employee.EmployeeImpl;
import com.kb.patten.composite.main.Node;
import com.kb.patten.composite.main.NodeSupport;

public class Microsoft extends Company {
	private static volatile int CURRENT_MEMBER_COUNT = 0;
	private static int EMPLOYEE_GROUP_COUNT = 3;
	// 此處為 Array
	private Employee[] employeeGroup = new EmployeeImpl[EMPLOYEE_GROUP_COUNT];

	@Override
	public void addEmployee(Employee employee) {
		synchronized (this) {
			if (CURRENT_MEMBER_COUNT == EMPLOYEE_GROUP_COUNT) {
				throw new UnsupportedOperationException("員工人數超過公司可負荷的限制囉 ... ");
			}
			employee.registryCompany(getClass());
			employeeGroup[CURRENT_MEMBER_COUNT] = employee;
			CURRENT_MEMBER_COUNT++;
		}
	}

	@Override
	public Iterator<? extends Node> getNodeIterator() {
		// 實作 Iterator
		return new Iterator<Employee>() {
			int currentIndex = 0;

			@Override
			public boolean hasNext() {
				if (employeeGroup.length == currentIndex
						|| employeeGroup[currentIndex] == null) {
					return false;
				}
				return true;
			}

			@Override
			public Employee next() {
				Employee result = employeeGroup[currentIndex];
				currentIndex++;
				return result;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException(
						"Microsoft 公司禁止於 Iterator 訪問階段移除員工喔!!!");
			}
		};
	}

	@Override
	public void printInfo() {
		System.out.println("This is Microsoft information...");
		System.out.println("********************************");
		NodeSupport.nodePrint(this);
	}

	@Override
	public void removeEmployee(Employee employee) {
		synchronized (this) {
			int removeIndex = 0;
			boolean removeFlag = false;

			Employee employeeInCompany;
			for (int i = 0; i < CURRENT_MEMBER_COUNT; i++) {
				employeeInCompany = employeeGroup[i];
				if (employeeInCompany.equals(employee)) {
					removeFlag = true;
					removeIndex = i;
					employeeInCompany = null;
					break;
				}
			}

			if (removeFlag) {
				// 若有移除元素的行為，則所有元素往前移一個位置，最後一個有記錄的位置設為null。
				for (int i = removeIndex; i < CURRENT_MEMBER_COUNT; i++) {
					if (isEmployeeMoveIegal(i)) {
						employeeGroup[i] = employeeGroup[i + 1];
					}
				}
				employeeGroup[CURRENT_MEMBER_COUNT - 1] = null;
				CURRENT_MEMBER_COUNT--;
			}
		}
	}

	/**
	 * 檢查是否為可以移動的位置(不可以為最後一個位置)
	 * 
	 * @param index
	 * @return
	 */
	private boolean isEmployeeMoveIegal(int index) {
		return (index + 1) != EMPLOYEE_GROUP_COUNT;
	}
}
