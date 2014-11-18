

import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;

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

    private Etat genererBloquant(List<Transition> tr)
    {
	int			i;
	Iterator<Character>	itr;
	Etat			trap;

	trap = new Etat(false, new Integer(-1));
	itr = this.alphabet.iterator();
	while (itr.hasNext())
	    tr.add(new Transition(trap, trap, itr.next().charValue()));
	return (trap);
    }

    private List<Transition> addTransitions(Map<Integer, List<Transition>> m, List<Transition> l, Integer i)
    {
	m.put(i, l);
	return (new LinkedList<Transition>());
    }

    /* Ca devait generer un nouvelle etat a partir d'une liste (regroupement...) mais j'ai pas trouve comment gerer la liste des transitions proprement dans la fonction appellante*/
    private Etat genererNouvelEtat(List<Etat> l)
    {
	Iterator<Etat>	itr;
	String		name;

	name = "";
	itr = l.iterator();
	while (itr.hasNext())
	    
    }

    public AFN deterministic()
    {
	Etat				trap;
	List<Etats>			eList;
	List<Transition>		tr;
	Map<Integer, List<Transition>>	trList;	

	trList = new HashMap<Integer, List<Transition>>();
	tr = new LinkedList<Transition>();
	trap = this.genererBloquant(tr);
	tr = addTransitions(trList, tr, trap.getNum());
	/* Jusque la on a genere l'etat "bloquant" celui qu'on utilise pour boucher les trous.
	   Il reste donc a generer les nouveaux etats avec leurs listes de transitions et remplir les listes de transitions des anciens etats*/
	return (new AFN(eList, this.alphabet, trList);
    }

    public String toString()
    {
	return ("I am the king");
    }

    public List<Character> getAlphabet()
    {
	return (this.alphabet);
    }
}