package chuong3;

public class bai4 {

		private int hour;
	    private int minute;
	    private int second;


	    public bai4() {
	        this.hour = 0;
	        this.minute = 0;
	        this.second = 0;
	    }

	  
	    public bai4(int hour, int minute, int second) {
	        setTime(hour, minute, second);
	    }

	  
	    public void setTime(int hour, int minute, int second) {
	        if (isValidTime(hour, minute, second)) {
	            this.hour = hour;
	            this.minute = minute;
	            this.second = second;
	        } else {
	            throw new IllegalArgumentException("Invalid hour, minute, or second!");
	        }
	    }

	  
	    private boolean isValidTime(int hour, int minute, int second) {
	        return (hour >= 0 && hour < 24) &&
	               (minute >= 0 && minute < 60) &&
	               (second >= 0 && second < 60);
	    }

	    // Getter methods
	    public int getHour() {
	        return hour;
	    }

	    public int getMinute() {
	        return minute;
	    }

	    public int getSecond() {
	        return second;
	    }

	    // Setter methods
	    public void setHour(int hour) {
	        if (hour >= 0 && hour < 24) {
	            this.hour = hour;
	        } else {
	            throw new IllegalArgumentException("Invalid hour!");
	        }
	    }

	    public void setMinute(int minute) {
	        if (minute >= 0 && minute < 60) {
	            this.minute = minute;
	        } else {
	            throw new IllegalArgumentException("Invalid minute!");
	        }
	    }

	    public void setSecond(int second) {
	        if (second >= 0 && second < 60) {
	            this.second = second;
	        } else {
	            throw new IllegalArgumentException("Invalid second!");
	        }
	    }

	    public String toString() {
	        return String.format("%02d:%02d:%02d", hour, minute, second);
	    }

	
	    public bai4 nextSecond() {
	        second++;
	        if (second == 60) {
	            second = 0;
	            nextMinute();
	        }
	        return this;
	    }

	    public bai4 nextMinute() {
	        minute++;
	        if (minute == 60) {
	            minute = 0;
	            nextHour();
	        }
	        return this;
	    }

	    public bai4 nextHour() {
	        hour++;
	        if (hour == 24) {
	            hour = 0;
	        }
	        return this;
	    }

	 
	    public bai4 previousSecond() {
	        second--;
	        if (second == -1) {
	            second = 59;
	            previousMinute();
	        }
	        return this;
	    }

	   
	    public bai4 previousMinute() {
	        minute--;
	        if (minute == -1) {
	            minute = 59;
	            previousHour();
	        }
	        return this;
	    }

	   
	    public bai4 previousHour() {
	        hour--;
	        if (hour == -1) {
	            hour = 23;
	        }
	        return this;
	    }
	    public static void main(String[] args) {
	    	bai4 time = new bai4(23, 59, 59);
	         System.out.println("Thời gian ban đầu: " + time);

	         time.nextSecond();
	         System.out.println("Sau nextSecond(): " + time);

	         time.nextMinute();
	         System.out.println("Sau nextMinute(): " + time);

	         time.nextHour();
	         System.out.println("Sau nextHour(): " + time);

	         time.previousSecond();
	         System.out.println("Sau previousSecond(): " + time);

	         time.previousMinute();
	         System.out.println("Sau previousMinute(): " + time);

	         time.previousHour();
	         System.out.println("Sau previousHour(): " + time);
		}
}
