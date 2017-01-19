package com.kb.patten.command.command;

/**
 * 命令物件的介面
 * 
 * @author KB
 * @version 1.0
 */
public interface Command {
	void execute();

	void undo();
}
