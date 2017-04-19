package com.kb.patten.composite.main;

import java.util.Iterator;

public class NodeSupport {

	public static void nodePrint(Node node) {
		Iterator<? extends Node> nodeIterator = node.getNodeIterator();
		Node element;
		while (nodeIterator.hasNext()) {
			element = nodeIterator.next();
			element.printInfo();
		}
		System.out.println("\n");
	}
}
