package StackUsingArray;

public class Stack {
public int[] arr;
int topElement;
 public Stack(int ElementValue)
 {
	 this.arr=new int[ElementValue];
	 this.topElement=-1;
	 
 }
 public boolean isEmpty()
 {
	 if(topElement==-1)
	 {
		 return true;
	 }
	 return false;
 }
 public boolean isFull()
 {
	 if(topElement==arr.length-1)
		 
	 {
		 return true;
	 }
	 return false;
 }
 public void push(int ElementValue)
 {
	 if(isFull())
	 {
		 System.out.println("Stack is OverFlow");
	 }
	 else {
		 topElement++;
		 arr[topElement]=ElementValue;
		 }
 }
 public void pop()
 
 {
	 if(isEmpty())
	 {
		 System.out.println("Stack is Empty");
	 }
	 else {
		 System.out.println("Poped Element "+arr[topElement]);
		 topElement--;
		 
	 }
 }
 public void peek()
 {
	 if(isEmpty())
	 {
		 System.out.println("Stack is Empty");
		
	 }
	 else {
		 System.out.println("Peek Element "+arr[topElement]);
		 
	 }
 }

}
