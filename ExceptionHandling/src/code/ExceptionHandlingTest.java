package code;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Baggage handBaggageObj1 ;
		
		try {
			
			//handBaggageObj1 = new HandBaggage(16,35,55,25,false);
			//handBaggageObj1 = new HandBaggage(13,36,55,25,false);
			//handBaggageObj1 = new HandBaggage(12,35,55,26,false);
			//handBaggageObj1 = new HandBaggage(14,30,20,10,true);
			handBaggageObj1 = new HandBaggage(14,30,20,10,false);
			handBaggageObj1.toString();


			
		}catch(WeightLimitExceededException wee) {
			System.out.println(wee);
		}catch(LiquidFoundException lfe) {
			System.out.println(lfe);
		}catch (OverSizedException ose) {
			System.out.println(ose);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
