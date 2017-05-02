package com.kb.patten.state.state;

import com.kb.patten.state.main.CellPhone;

/**
 * Concrete State 限制狀態
 * 
 * @author KB
 * @version 1.0
 */
public class RestrictState extends State {

	public RestrictState(CellPhone cellPoone) {
		super(cellPoone);
	}

	@Override
	public void callSomeOne() {
		System.out.println("限制通話中，請加值可用餘額！！");
	}

}
