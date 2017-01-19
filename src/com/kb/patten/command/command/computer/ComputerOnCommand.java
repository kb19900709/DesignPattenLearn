package com.kb.patten.command.command.computer;

import com.kb.patten.command.command.Command;
import com.kb.patten.command.service.computer.Computer;

/**
 * 電腦命令物件 for on
 * 
 * @author KB
 * @version 1.0
 */
public class ComputerOnCommand implements Command {

	Computer computer;

	public ComputerOnCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.on();
		computer.doSomething();
	}

	@Override
	public void undo() {
		computer.off();
	}

}
