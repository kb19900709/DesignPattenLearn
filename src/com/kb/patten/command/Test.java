package com.kb.patten.command;

import com.kb.patten.command.command.computer.ComputerOffCommand;
import com.kb.patten.command.command.computer.ComputerOnCommand;
import com.kb.patten.command.main.Jarvis;
import com.kb.patten.command.service.computer.MacBook;
import com.kb.patten.command.service.computer.Windows;

public class Test {
	public static void main(String[] args) {
		// 啟動賈維斯智慧管家
		Jarvis robot = new Jarvis(2);

		// 註冊兩個電腦命令物件供後續使用
		robot.registerCommand(1, new ComputerOnCommand(new MacBook()), new ComputerOffCommand(new MacBook()));
		robot.registerCommand(2, new ComputerOnCommand(new Windows()), new ComputerOffCommand(new Windows()));

		// 位置一試用
		robot.triggerOnCommand(1);
		robot.undoLastRequest();
		robot.triggerOnCommand(1);
		robot.triggerOffCommand(1);
		robot.undoLastRequest();

		// 位置二試用
		robot.triggerOnCommand(2);

		// error block
		robot.triggerOnCommand(-1);
		robot.triggerOnCommand(0);
		robot.triggerOnCommand(3);

	}
}
