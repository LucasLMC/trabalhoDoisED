package com.lc.vo;

public class Tree {

	private Node node;
	private int amout;
	
	public Node newNode(String character, int qtd) {
		
		Node node = new Node();
		node.setName(character);
		node.setQtd(qtd);
		
		return node;
	}
	
	public Node firstNode (String name) {
		
		final int qtd = 1;
		node = newNode(name, qtd);
		
		return node;
	}
	public Node newLevel(String name, int qtd) {
		
		Node subNode = newNode(name, qtd);
		
		return subNode;

	}
	
	public void listNodes (Node levelsNode, Node node) {
		
		levelsNode.getSubTree().add(node);
		
	}
	
	public int getAmout() {
		return amout;
	}

	public void setAmout(int amout) {
		this.amout = amout;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
	
	
	
}
