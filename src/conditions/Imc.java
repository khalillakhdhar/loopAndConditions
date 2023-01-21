package conditions;

public class Imc {
	private double poids,taille;
	
	
public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	
public Imc() {
		super();
		// TODO Auto-generated constructor stub
	}



public Imc(double poids, double taille) {
	super();
	this.poids = poids;
	this.taille = taille;
}
public long calculeImc()
{
	double indice=poids/(Math.pow(taille, 2));
	return Math.round(indice);

}
public String interpretation()
{
	long im=calculeImc();
	if(im<20)
		return "maigre";
	else if(im<=25)
		return "idéal";
	else
		return "surpoids";
	
}
@Override
public String toString() {
	return "Imc [poids=" + poids + ", taille=" + taille + ", calcule Imc=" + calculeImc() + ", interpretation="
			+ interpretation() + "]";
}

}
