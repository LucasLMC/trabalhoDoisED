package com.lc.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.lc.vo.Tree;
//import com.lc.vo.Node;

public class GetTree {

	private Tree tree = new Tree();
	private Scanner scan = new Scanner (System.in);
	private List<Node> listNodes = new ArrayList<>();

	
	public void Treee() {
		
		Node snack = tree.firstNode("Casa");
		

		putFirstLevel(5,snack);
		
		putOthersLevels(4,0);	
		putOthersLevels(5,1);
		putOthersLevels(3,2);
		putOthersLevels(5,3);
		putOthersLevels(4,4);
		putOthersLevels(4,5);
		putOthersLevels(4,7);
		putOthersLevels(3,8);
		putOthersLevels(4,9);
		putOthersLevels(2,10);
		putOthersLevels(3,16);
		putOthersLevels(5,11);
		putOthersLevels(28,17);
	
		for (int i = listNodes.size(); i < 0; i++) {
			listNodes.get(i+1).calcValue();
		}
		
		snack.calcValue();
		System.out.println("To aqui");
		System.out.println(" Valor total :" + snack.getName()+ " de " + snack.getValue()+":");
	}
	
	public int readInt() {
		int number = scan.nextInt();
		scan.nextLine();
		
		return number;
	}

	public void putFirstLevel(int index, Node snack_bar) {
		for(int i=0;i<index;i++) {
			Node node = tree.newLevel(scan.nextLine(), readInt());
			tree.listNodes(snack_bar,node);
			listNodes.add(node);
		}
	}
	
	public void putOthersLevels( int index, int list) {

		for (int i = 0; i < index ; i++) {
			
			Node node = tree.newLevel(scan.nextLine(), readInt());
			tree.listNodes(listNodes.get(list), node);
			listNodes.add(node);
		}
		
	}
	
	public void putValues(int index, int list) {
		for (int i = 0; i < index; i++) {
			
			int value = readInt();
			listNodes.get(list+i).setValue(value);
			
		}
	}
}
