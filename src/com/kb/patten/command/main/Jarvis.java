package com.kb.patten.command.main;

import com.kb.patten.command.command.Command;
import com.kb.patten.command.command.NoCommand;

public class Jarvis {
	Command[] offCommand;
	Command[] onCommand;
	int supportCnt;
	Command undoCommand;

	/**
	 * 支援命令數
	 * 
	 * @param supportCnt
	 */
	public Jarvis(int supportCnt) {
		// 初始化時使用空命令物件
		Command initCommand = new NoCommand();
		offCommand = new Command[supportCnt];
		onCommand = new Command[supportCnt];
		initCommandParams(initCommand, offCommand);
		initCommandParams(initCommand, onCommand);
		this.supportCnt = supportCnt;
		this.undoCommand = initCommand;
	}

	/**
	 * 註冊命令物件
	 * 
	 * @param location
	 * @param onCommandSetting
	 * @param offCommandSetting
	 */
	public void registerCommand(int location, Command onCommandSetting, Command offCommandSetting) {
		if (location > supportCnt || location <= 0) {
			System.out.println("超越賈維斯系統支援上限了");
			return;
		}

		offCommand[location - 1] = offCommandSetting;
		onCommand[location - 1] = onCommandSetting;
		System.out.println(String.format("賈維斯註冊 %s and %s 完畢", onCommandSetting.getClass().getSimpleName(),
				offCommandSetting.getClass().getSimpleName()));
	}

	/**
	 * 使用 off 功能
	 * 
	 * @param location
	 *            位置
	 */
	public void triggerOffCommand(int location) {
		if (location > supportCnt || location <= 0) {
			System.out.println("超越賈維斯系統支援上限了");
			return;
		}

		Command command = offCommand[location - 1];
		command.execute();
		this.undoCommand = command;
	}

	/**
	 * 使用 on 功能
	 * 
	 * @param location
	 *            位置
	 */
	public void triggerOnCommand(int location) {
		if (location > supportCnt || location <= 0) {
			System.out.println("超越賈維斯系統支援上限了");
			return;
		}

		Command command = onCommand[location - 1];
		command.execute();
		this.undoCommand = command;
	}

	/**
	 * 還原作業
	 */
	public void undoLastRequest() {
		undoCommand.undo();
	}

	/**
	 * 初始化命令物件陣列
	 * 
	 * @param initCommand
	 * @param targetCommand
	 */
	private void initCommandParams(Command initCommand, Command[] targetCommand) {
		for (int i = 0; i < targetCommand.length; i++) {
			targetCommand[i] = initCommand;
		}
	}
}
