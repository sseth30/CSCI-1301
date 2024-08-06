// For an overview of the program and sample inputs, be sure to check out `Circle.md`

public class Circle {
	
	private String name;       // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return name;	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		this.name = name;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		this.x = x;	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y = y;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		if (radius >= 0)	{
			this.radius = radius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2 * Math.PI * radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return 2 * radius;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		return Math.abs(radius - 1) < THRESHOLD && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD;	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString(Circle circle) {
			return "name: " + name + "\n" + 
		           "center: (" + getX() + "," + getY() + ")" + "\n" + 
		           "radius: " + getRadius();
		}
	public boolean equals(Circle anotherCircle) {
        return Math.abs(this.radius - anotherCircle.radius) < THRESHOLD && Math.abs(this.x - anotherCircle.x) < THRESHOLD && Math.abs(this.y - anotherCircle.y) < THRESHOLD;
    }
	    public double distance(Circle anotherCircle) {
	        return Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
	    }
	    public boolean isSmaller(Circle anotherCircle) {
	        return this.diameter() < anotherCircle.diameter();
	    }
	    public int compareTo(Circle anotherCircle) {
	        if (this.diameter() > anotherCircle.diameter()) return 1;
	        else if (this.diameter() < anotherCircle.diameter()) return -1;
	        else return 0;
	    }
	    public boolean intersects(Circle anotherCircle) {
	        return this.distance(anotherCircle) < (this.radius + anotherCircle.radius);
	    }


	 }
	
