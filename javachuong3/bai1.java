package chuong3;

public class bai1 {
	private double real;
    private double imag;

    
    public bai1() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public bai1(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

   
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

  
    public boolean isReal() {
        return imag == 0;
    }

    
    public boolean isImaginary() {
        return imag != 0;
    }

  
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(bai1 another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }


    public double argument() {
        return Math.atan2(imag, real);
    }

   
    public bai1 addNew(bai1 right) {
        return new bai1(this.real + right.real, this.imag + right.imag);
    }

    
    public bai1 subtractNew(bai1 right) {
        return new bai1(this.real - right.real, this.imag - right.imag);
    }

   
    public bai1 multiply(bai1 right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        return new bai1(newReal, newImag);
    }

    
    public bai1 divide(bai1 right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        return new bai1(newReal, newImag);
    }

    
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
    public static void main(String[] args) {
    	bai1 c1 = new bai1 (3, 4);
    	bai1 c2 = new bai1(1, -2);
        
      
        System.out.println("Complex number 1: " + c1);
        System.out.println("Complex number 2: " + c2);
        
   
        System.out.println("Is c1 real? " + c1.isReal());
        System.out.println("Is c1 imaginary? " + c1.isImaginary());

    
        System.out.println("Magnitude of c1: " + c1.magnitude());
        System.out.println("Argument of c1: " + c1.argument());

   
        System.out.println("c1 + c2 = " + c1.addNew(c2));
        System.out.println("c1 - c2 = " + c1.subtractNew(c2));

        System.out.println("c1 * c2 = " + c1.multiply(c2));
        System.out.println("c1 / c2 = " + c1.divide(c2));
    
	}
}
