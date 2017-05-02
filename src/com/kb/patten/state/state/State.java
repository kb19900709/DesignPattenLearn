package com.kb.patten.state.state;

import com.kb.patten.state.main.CellPhone;

/**
 * State
 * 
 * @author KB
 * @version 1.0
 */
public abstract class State {

	CellPhone cellPoone;

	public State(CellPhone cellPoone) {
		this.cellPoone = cellPoone;
	}

	public abstract void callSomeOne();
}
