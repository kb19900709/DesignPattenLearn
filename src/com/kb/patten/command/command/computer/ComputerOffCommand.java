package com.kb.patten.command.command.computer;

import com.kb.patten.command.command.Command;
import com.kb.patten.command.service.computer.Computer;

/**
 * 電腦命令物件 for off
 * 
 * @author KB
 * @version 1.0
 */
public class ComputerOffCommand implements Command {

	Computer computer;

	public ComputerOffCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.off();
	}

	@Override
	public void undo() {
		computer.on();
		computer.doSomething();
	}

}
