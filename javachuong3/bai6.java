package chuong3;

public class bai6 {
	private int x1, y1, x2, y2; 

    public bai6(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

  
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }

   
    public boolean collidesWith(bai6 ball) {
        boolean collision = false;

      
        if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2) {
            ball.reflectHorizontal();
            collision = true;
        }

  
        if (ball.getY() - ball.getRadius() <= y1 || ball.getY() + ball.getRadius() >= y2) {
            ball.reflectVertical();
            collision = true;
        }

        return collision;
    }

   
    public String toString() {
        return "Container [(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }
    public static void main(String[] args) {
    	bai6 ball = new bai6(50, 50, 5, 10, 30);
    	bai6 box = new bai6(0, 0, 100, 100);
    	for (int step = 0; step < 100; ++step) {
    	   ball.move();
    	   box.collidesWith(ball);
    	   System.out.println(ball); // manual check the position of the ball
	}
    }
}
