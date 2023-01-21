package conditions;

public class Divisibilite {
public void afficheDivis(int x,int y)
{
for(int i=x;i<=y;i++)
{
if(i%3==0)
{
	System.out.println("i= "+i);
}
}

}
public void premier(int x)
{
	int i=2;
	while((x%i!=0)&&(i<=(x/2)))
			{
		i++;
			}
	if(i>x/2)
		System.out.println(x+" est premier");
	else
		System.out.println(x+" n'est pas premier");

}

}
