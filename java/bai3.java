package chuong1;

public class bai3 {
	private float length;
	private float width;
	
	public bai3() {
		this.length=1.0f;
		this.width= 1.0f;
	}

	public bai3(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return (length+width)*2;
	}
	
	public String toString() {
		return "Rectangle[length= "+ this.length+",width= "+this.width+"]";
	}
	
	public static void main(String[] args) {
		bai3 r1= new bai3(1.2f , 3.4f);
		bai3 r2 = new bai3();
		System.out.println(r2);
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println("lenght is: "+r1.getLength());
		System.out.println("width is: "+r1.getWidth());
		System.out.println("area is: "+r1.getArea());
		System.out.println("Perimeter is: "+r1.getPerimeter());
	}
	
}
