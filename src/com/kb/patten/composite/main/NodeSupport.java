package com.kb.patten.composite.main;

import java.util.Iterator;

/**
 * Node 的資訊服務
 * 
 * @author KB
 * @version 1.0
 */
public class NodeSupport {

	/**
	 * 以節點為單位印出節點下所有資訊
	 * 
	 * @param node
	 */
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
