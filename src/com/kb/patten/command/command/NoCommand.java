package com.kb.patten.command.command;

/**
 * 空物件，實作命令的介面但是不做任何事情
 * 
 * @author KB
 * @version 1.0
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}

}
