package chuong3;

public class bai2 {
	private double[] coeffs;

    
    public bai2(double... coeffs) {
        this.coeffs = coeffs;
    }

  
    public int getDegree() {
        return coeffs.length - 1;
    }

 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }


    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

  
    public bai2 add(bai2 right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double a = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double b = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            newCoeffs[i] = a + b;
        }
        return new bai2(newCoeffs);
    }

    // Nhân hai đa thức
    public bai2 multiply(bai2 right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new bai2(newCoeffs);
    }
    public static void main(String[] args) {
    
    	bai2 p1 = new bai2(1.1, 2.2, 3.3);
    	bai2 p2 = new bai2(1.1, 2.2, 3.3, 4.4, 5.5);
   
    	double[] coeffs = {1.2, 3.4, 5.6, 7.8};
    	bai2 p3 = new bai2(coeffs);
	}
}
