

import java.util.List;

public class Etat
{
    private boolean		acceptant;
    private Integer		num;

    public Etat(boolean acceptant, Integer num)
    {
	this.acceptant = acceptant;
	this.num = num;
    }

    public boolean estAcceptant()
    {
	return (this.acceptant);
    }

    public String toString()
    {
	return (this.num.toString());
    }

    public Integer getNum()
    {
	return (this.num);
    }
}