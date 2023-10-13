import java.util.Date;
 
public class Square {
	private double side;
	private double area;
	private Date dateCreated;
 
	public Square() {
        this.dateCreated = new Date();
	}
 
	public Square(double side) {
    	this.side = side;
        this.dateCreated = new Date();
        calculateArea();
	}
 
	public double getSide() {
    	return side;
	}
 
	public void setSide(double side) {
    	this.side = side;
        calculateArea();
	}
 
	public double getArea() {
    	return area;
	}
 
	public void setArea(double area) {
    	this.area = area;
	}
 
	public Date getDateCreated() {
    	return dateCreated;
	}
 
	public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
	}
 
	private void calculateArea() {
    	this.area = this.side * this.side;
	}
 
	@Override
	public String toString() {
    	return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", dateCreated=" + dateCreated +
            	'}';
	}
 
	public static void main(String[] args) {
    	Square square1 = new Square(5);
        System.out.println(square1.toString());
 
    	Square square2 = new Square();
        square2.setSide(10);
        System.out.println(square2.toString());
	}
}