package code;

public class ChemicalElement implements Comparable<ChemicalElement> {
	
	private float atomicWeight;
	private int atomicNumber;
	private String symbol;
	

	public ChemicalElement() {
		
	}


	public ChemicalElement(float atomicWeight, int atomicNumber, String symbol) {
		super();
		this.atomicWeight = atomicWeight;
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
	}


	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.atomicNumber, o.atomicNumber);
	}

}
