package com.algos.datastructures;

public class SeperateChainingHashST<Key, Value> {

	
	private int M=97; //Size of the linked list.
	 private Node[] st = new Node[M];
	
	private static class Node
	{
		public Node(Object key, Object value, Node node) {
			// TODO Auto-generated constructor stub
		this.key=key;
		this.value=value;
		this.next=node;
			
			
			
		}
		//Since no generic array creation. Declare key and value of type object
		private Object key;
		private Object value;
		private Node next;
		
		
	}
	
	private int hash(Key key)
	{
		//0x7ffffff to make the code positive
		//%M to make the range between 1 to M-1 for the array.
		return(key.hashCode() & 0x7ffffff) % M;  
	}
	
	
	
	public Value get(Key key){
		
		int i = hash(key);
		
	for (Node node=st[i];node!=null;node=node.next) {
		if(node.key==key){
			return (Value)node.value;
		}
		
	}
		
		return null;
	}
	
	
	public void put(Key key, Value value){
		int i = hash(key);
		
		for (Node node=st[i];node!=null;node=node.next) {
			
			if(node.key==key){
				node.value= value;
				return;
			}
			
			
			
		}
		
		st[i] = new Node(key,value,st[i]);
		
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
