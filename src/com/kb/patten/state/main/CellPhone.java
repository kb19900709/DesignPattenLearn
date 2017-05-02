package com.kb.patten.state.main;

import com.kb.patten.state.state.NoBalance;
import com.kb.patten.state.state.Normal;
import com.kb.patten.state.state.RestrictState;
import com.kb.patten.state.state.State;

/**
 * Context
 * 
 * @author KB
 * @version 1.0
 */
public class CellPhone {
	/**
	 * 單次通話扣款金額
	 */
	public static final int SINGLE_CALL_BALANCE = 20;

	private int availableBalance;
	private State currentState;

	private State noBalanceState;
	private State normalState;
	private State restrictState;

	public CellPhone(int balance) {
		if (balance <= 0) {
			throw new UnsupportedOperationException("首次儲值金額須大於0");
		}
		this.availableBalance = balance;
		this.normalState = new Normal(this);
		this.noBalanceState = new NoBalance(this);
		this.restrictState = new RestrictState(this);
		// 預設為正常狀態
		currentState = normalState;
	}

	/**
	 * 加值可用金額
	 * 
	 * @param balance
	 */
	public void addBalance(int balance) {
		availableBalance += balance;
		System.out.println(String.format("加值成功！當前餘額為 %s", availableBalance));
		checkAndChangeState();
	}

	public void callSomeOne() {
		currentState.callSomeOne();
	}

	/**
	 * 通話後扣款可用金額
	 * 
	 * @param balance
	 */
	public void chargeBalance(int balance) {
		availableBalance -= balance;
		System.out.println(String.format("扣款成功！當前餘額為 %s", availableBalance));
		checkAndChangeState();
	}

	public State getCurrentState() {
		return currentState;
	}

	public State getNoBalanceState() {
		return noBalanceState;
	}

	public State getNormalState() {
		return normalState;
	}

	public State getRestrictState() {
		return restrictState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	/**
	 * 依據 Context 的當前屬性做狀態上的置換。此範例來說，availableBalance 以及 currentState 的值將會影響狀態。
	 */
	private void checkAndChangeState() {
		if (availableBalance > 0) {
			setCurrentState(getNormalState());
			return;
		}

		// 若為非限制狀態，則狀態為無餘額狀態
		if (!getCurrentState().equals(getRestrictState())) {
			setCurrentState(getNoBalanceState());
		}
	}
}
