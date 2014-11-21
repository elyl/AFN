package automates;

import java.util.Map;
import java.util.List;

public class AFN implements Automata
{
    protected List<Etat>		etats;
    protected Map<Etat, Tranisiton>	transitions;
    protected List<Character>		alphabet;

    public AFN(List<Etat> etats, Map<Etat, Transition> transitions, List<Character> alphabet)
    {
	this.etats =		etats;
	this.transitions =	transitions;
	this.alphabet =		alphabet;
    }

    public boolean accept(String mot)
    {
	return (false);
    }

    public boolean isEmpty()
    {
	return (false);
    }

    public AFN deterministic()
    {
	return (null);
    }

    public String toString()
    {
	return ("I am the king");
    }
}