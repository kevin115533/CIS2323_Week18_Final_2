import cand.*;

public class DemoCandles{
	public static void main(String args[]){
	
	Candle candle1 = new Candle();
	ScentedCandle vanilla = new ScentedCandle();
	
	candle1.setColor("Red");
	candle1.setH(3.0);
	
	vanilla.setColor("yellow");
	vanilla.setH(4.0);
	
	System.out.println("A " + candle1.getH() + " inch " + candle1.getColor() +
	" candle will cost $" + candle1.getP());
	
	System.out.println("A " + vanilla.getH() + " inch " + vanilla.getColor() +
	" candle will cost $" + vanilla.getP());
	
	}
}