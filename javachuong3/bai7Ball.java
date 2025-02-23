package chuong3;

public class bai7Ball {
	 private float x, y, z;

	    public bai7Ball(float x, float y, float z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    // Getter methods
	    public float getX() { return x; }
	    public float getY() { return y; }
	    public float getZ() { return z; }

	    // Setter method
	    public void setXYZ(float x, float y, float z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	 
	    public String toString() {
	        return "(" + x + ", " + y + ", " + z + ")";
	    }
}
