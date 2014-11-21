package automates;

public class Etat
{
    private boolean	acceptant;

    public Etat(boolean acceptant)
    {
	this.acceptant = acceptant;
    }

    public boolean estAcceptant()
    {
	return (this.acceptant);
    }
}