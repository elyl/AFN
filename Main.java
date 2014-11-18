

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String args[])
    {
	LinkedList<Etat>			etats;
	LinkedList<Transition>			transitions;
	HashMap<Integer, List<Transition>>	m;
	AFN					a;
	Etat					e1, e2, e3, e4;

	System.out.println(new Integer(2).toString());
	etats = new LinkedList<Etat>();
	m = new HashMap<Integer, List<Transition>>();
	transitions = new LinkedList<Transition>();
	e1 = new Etat(false, new Integer(1));
	e2 = new Etat(false, new Integer(2));
	e3 = new Etat(false, new Integer(3));
	e4 = new Etat(true, new Integer(4));
	etats.add(e1);
	etats.add(e2);
	etats.add(e3);
	etats.add(e4);
	transitions.add(new Transition(e1, e2, 't'));
	transitions.add(new Transition(e1, e3, 'o'));
	m.put(e1.getNum(), transitions);
	transitions = new LinkedList<Transition>();
	transitions.add(new Transition(e2, e3, 'o'));
	transitions.add(new Transition(e2, e1, 't'));
	m.put(e2.getNum(), transitions);
	transitions = new LinkedList<Transition>();
	transitions.add(new Transition(e3, e4, 't'));
	transitions.add(new Transition(e3, e1, 'o'));
	m.put(e3.getNum(), transitions);
	transitions = new LinkedList<Transition>();
	transitions.add(new Transition(e4, e4, 'o'));
	transitions.add(new Transition(e4, e3, 't'));
	m.put(e4.getNum(), transitions);
	a = new AFN(etats, null, m);
	System.out.println(a.accept("ot"));
    }
}