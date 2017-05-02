package com.kb.patten.state.state;

import com.kb.patten.state.main.CellPhone;

/**
 * Concrete State 無餘額狀態
 * 
 * @author KB
 * @version 1.0
 */
public class NoBalance extends State {

	public NoBalance(CellPhone cellPoone) {
		super(cellPoone);
	}

	@Override
	public void callSomeOne() {
		cellPoone.setCurrentState(cellPoone.getRestrictState());
		System.out.println("可用餘額不足，系統已限制通話。");
	}

}
