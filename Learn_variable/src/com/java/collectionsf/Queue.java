package com.java.collectionsf;

public class Queue {
	
	int Q[]=new int[5];
	int f;
	int r;
	int Size=0;
	
	
	public void AddQ(int data)
	{
			if(!isFull()) {
		Q[r]=data;
		r=(r+1)%5;
		Size=Size+1;
		System.out.println(Size);
			}
			else {
				
				System.out.println("queue is full");
				
			}
	}
	public int Dqueue() {
		int data=Q[f];
		if(!isEmpty()) {
		
		f=(f+1)%5;
		Size=Size-1;
		}
		else
			
			System.out.println("queue is Empty");
			
		return data;
	}

	public void show() {
		System.out.print("Queue Data:  ");
		for(int j=0;j<Size;j++) {
			
			System.out.print(Q[(f+j)%5]+" ");
			
		}
		
	}
	public int GetSize() {
		return Size;
		
		
	}
	public boolean isEmpty() {
		return GetSize()==0;
		
		
	}
	public boolean isFull() {
		return GetSize()==5;
		
		
	}
	

}