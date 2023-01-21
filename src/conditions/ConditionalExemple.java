package conditions;

public class ConditionalExemple {
	
	
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public ConditionalExemple(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public ConditionalExemple() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String divisible()
	{
		if(this.a%this.b==0)
		{
			return b+" divise "+a;
		}
		else
			return a+" ne divise pas "+b;
	}
	

}
