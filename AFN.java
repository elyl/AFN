

import java.util.List;
import java.util.Iterator;
import java.util.Map;

public class AFN implements Automata
{
    protected List<Etat>			etats;
    protected List<Character>			alphabet;
    protected Map<Integer, List<Transition>>	transitions;

    public AFN(List<Etat> etats, List<Character> alphabet, Map<Integer, List<Transition>> transitions)
    {
	this.etats =		etats;
	this.alphabet =		alphabet;
	this.transitions =	transitions;
    }

    public boolean accept(String mot)
    {
	Iterator<Transition>	itr;
	Etat			e;
	Transition		t;
	int			i;
	char			c;
	boolean			b;

	t = null;
	e = this.etats.get(0);
	i = 0;
	while (i < mot.length())
	    {
		c = mot.charAt(i++);
		System.out.println("Depart : " + e + ", traitement: " + c);
		itr = this.transitions.get(e.getNum()).iterator();
		b = false;
		while (itr.hasNext() && !b)
		    {
			t = itr.next();
			System.out.println("Etude de la transition: " + t);
			if (t.getSymbole() == c)
			    b = true;
		    }
		e = t.getDestination();
		if (!b)
		    {
			System.out.println("Pas de transitions trouvee");
			return (false);
		    }
	    }
	System.out.println("arrivee: " + t.getDestination());
	return (t.getDestination().estAcceptant());
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