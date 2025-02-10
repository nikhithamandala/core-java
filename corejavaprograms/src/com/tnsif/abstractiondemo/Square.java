package com.tnsif.abstractiondemo;

public class Square extends Shape{
	private float side;
	public Square(float side) {
		this.side=side;
	}

	@Override
	void calarea() {
		super.area=side*side;
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		return "Square [side=" + side + "]";
	}
	public static void main(String[] args) {
//		Square s=new Square(side);
		Shape p=new Square(4.0f);		
		System.out.println(p);
		p.calarea();
		p.show();	
	}
}
