package com.kb.patten.composite.main;

import java.util.Iterator;
import java.util.List;

public abstract class Node {

	public Iterator<? extends Node> getNodeIterator() {
		throw new UnsupportedOperationException();
	}

	public void printInfo() {
		throw new UnsupportedOperationException();
	}

	public void setNodeList(List<? extends Node> nodeList) {
		throw new UnsupportedOperationException();
	}
}
