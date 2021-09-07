package com.assignment06_09;


class Triangle1{
	int areaResult(int side1,int side2,int side3) {
		int perimeter = side1 + side2 + side3;
		int semiperimeter = (perimeter)/2;
		int areaoftriangle = (int) Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
		return areaoftriangle;
	}
	
	int perimeterResult(int side1,int side2,int side3) {
		int perimeter = side1 + side2 + side3;
		return perimeter;
	}
}
public class AreaOfTriangleWithParameter {
	public static void main(String args[]) { 
		Triangle1 triangle1 = new Triangle1();
		int temp = triangle1.areaResult(3,4,5);
		System.out.println("Area of Triangle is : "+temp);
		
		int temp1 = triangle1.perimeterResult(3, 4, 5);
		System.out.println("Perimeter of Triangle is : "+temp1);
	}
}
