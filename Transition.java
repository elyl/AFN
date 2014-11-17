

public class Transition
{
    private Etat	origine;
    private Etat	destination;
    private char	symbole;

    public Transition(Etat origine, Etat destination, char symbole)
    {
	this.origine = origine;
	this.destination = destination;
	this.symbole = symbole;
    }

    public Etat getOrigine()
    {
	return (this.origine);
    }

    public Etat getDestination()
    {
	return (this.destination);
    }

    public char getSymbole()
    {
	return (this.symbole);
    }

    public String toString()
    {    
	return ("Origine: " + origine + ", destination: " + destination + ", symbole: " + symbole);
    }
}