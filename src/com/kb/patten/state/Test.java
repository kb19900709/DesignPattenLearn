package com.kb.patten.state;

import com.kb.patten.state.main.CellPhone;

public class Test {
	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone(10);

		System.out.println("第一次打手機");
		cellPhone.callSomeOne();
		System.out.println("********************\n");

		System.out.println("第二次打手機");
		cellPhone.callSomeOne();
		System.out.println("********************\n");

		System.out.println("第三次打手機");
		cellPhone.callSomeOne();
		System.out.println("********************\n");

		System.out.println("第四次打手機，加值100元");
		cellPhone.addBalance(100);
		cellPhone.callSomeOne();
		System.out.println("********************");
	}
}
