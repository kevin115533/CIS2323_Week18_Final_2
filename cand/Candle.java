package cand;

public class Candle{
	String color;
	double height;
	double price;
	
	public String getColor(){
		return color;
	}
	
	public double getH(){
		return height;
	}
	
	public double getP(){
		return price;
	}
	
	public void setColor(String a){
		color = a;
	}
	
	public void setH(double a){
		height = a;
		price = (height * 2);
	}
}