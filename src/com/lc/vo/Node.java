package com.lc.vo;

import java.util.ArrayList;

public class Node {
	private String name;
	private int value;
	private int qdt;
	private ArrayList<Node> subTree = new ArrayList<>();
	
	public ArrayList<Node> getSubTree() {
		return subTree;
	}
	
	public void getChildren(ArrayList<Node> subTree) {
		this.subTree = subTree;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getQtd() {
		return qdt;
		
	}
	public void setQtd(int qtd) {
		this.qdt = qtd;
	}
	
	public void calcValue () {
		
		int number = 0; 
		if (!subTree.isEmpty()) {
			for (Node node : subTree) {
				number += (node.getQtd() * node.getValue());
			}
			
			this.value = number;
		}
	}
}
