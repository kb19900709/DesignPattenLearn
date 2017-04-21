package com.kb.patten.composite.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 根節點
 * 
 * @author KB
 * @version 1.0
 */
public class RootNode extends Node {
	private List<? extends Node> nodeList = new ArrayList<>();

	@Override
	public Iterator<? extends Node> getNodeIterator() {
		return nodeList.iterator();
	}

	@Override
	public void printInfo() {
		NodeSupport.nodePrint(this);
	}

	@Override
	public void setNodeList(List<? extends Node> nodeList) {
		this.nodeList = nodeList;
	}
}
