package code;

public class HandBaggage extends Baggage {

	private boolean liquidFound;
	
	public HandBaggage(float weight,float length,float height,float width,boolean liquidFound) throws WeightLimitExceededException, OverSizedException, LiquidFoundException  {
		// TODO Auto-generated constructor stub
		System.out.println("Checking hand baggage...");
		if(weight>15) {
			throw new WeightLimitExceededException("Only 7kgs are permitted in hand baggage..");
		}else if(height > 35 || length > 55 || width > 25 || height+length+width > 115) {
			throw new OverSizedException("Hand Baggage is oversized ...Please book an extra seat ");
			
		}else if(liquidFound == true) {
			throw new LiquidFoundException("Liquids more than 100 ml are not permitted ");
		}else {
			this.weight = weight;
			this.height = height;
			this.length = length;
			this.width = width;
			this.liquidFound = false;
			System.out.println("Hand baggage accepted..You are ready yo fly");
		}
	}

	@Override
	public String toString() {
		return "HandBaggage [liquidFound=" + liquidFound + ", weight=" + weight + ", length=" + length + ", height="
				+ height + ", width=" + width + "]";
	}
	
	
	
	

}
