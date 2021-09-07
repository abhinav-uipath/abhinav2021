package com.assignment06_09;


class Rectangle{
	int length,breadth;
	int Area(int length,int breadth){
		int area = length * breadth;
		return area;
	}
	
	int Area2(int length1,int breadth1){
		int area1 = length1 * breadth1;
		return area1;
	}
}
public class AreaOfRectangle {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle();
		int temp = rectangle.Area(8, 5);
		System.out.println("Area of 1st Rectangle : "+temp);
		int temp1 = rectangle.Area(5, 8);
		System.out.println("Area of 1st Rectangle : "+temp1);
	}
}
