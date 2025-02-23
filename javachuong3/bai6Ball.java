package chuong3;

public class bai6Ball {
	private float x, y;          
    private int radius;          
    private float dx, dy;       

    public bai6Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double radians = Math.toRadians(direction);
        this.dx = (float) (speed * Math.cos(radians));
        this.dy = (float) (-speed * Math.sin(radians)); 
    }

    // Getter methods
    public float getX() { return x; }
    public float getY() { return y; }
    public int getRadius() { return radius; }
    public float getDx() { return dx; }
    public float getDy() { return dy; }

    // Setter methods
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setDx(float dx) { this.dx = dx; }
    public void setDy(float dy) { this.dy = dy; }

   
    public void move() {
        x += dx;
        y += dy;
    }

  
    public void reflectHorizontal() {
        dx = -dx;
    }

   
    public void reflectVertical() {
        dy = -dy;
    }

 
    public String toString() {
        return "Ball at (" + x + ", " + y + "), speed=(" + dx + ", " + dy + ")";
    }
}
