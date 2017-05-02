package com.kb.patten.state.state;

import com.kb.patten.state.main.CellPhone;

/**
 * Concrete State 正常狀態
 * 
 * @author KB
 * @version 1.0
 */
public class Normal extends State {

	public Normal(CellPhone cellPoone) {
		super(cellPoone);
	}

	@Override
	public void callSomeOne() {
		int singleCallBalance = CellPhone.SINGLE_CALL_BALANCE;

		System.out
				.println(String.format("正常通話，單次通話將扣款 -%s", singleCallBalance));
		cellPoone.chargeBalance(singleCallBalance);
	}

}
