package cand;

public class ScentedCandle extends Candle{
	private String scent;
	
	public void setS(String a){
		scent = a;
	}
	
	public String getS(){
		return scent;
	}

	public void setH(double a){
		height = a;
		price = (height * 3);
	}	
}