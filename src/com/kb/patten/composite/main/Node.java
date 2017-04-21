package com.kb.patten.composite.main;

import java.util.Iterator;
import java.util.List;

/**
 * 節點型別，若子類別無複寫的方法被調用則會拋出 UnsupportedOperationException
 * 
 * @author KB
 * @version 1.0
 */
public abstract class Node {

	/**
	 * 取得節點內部集合的 Iterator
	 * 
	 * @return
	 */
	public Iterator<? extends Node> getNodeIterator() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 印出該節點資訊
	 */
	public void printInfo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 設定節點集合
	 * 
	 * @param nodeList
	 */
	public void setNodeList(List<? extends Node> nodeList) {
		throw new UnsupportedOperationException();
	}
}
