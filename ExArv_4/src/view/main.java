package view;

import docarmo.ArvoreInt.Arvore;

public class main {

	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		
		int [] vt = {7, 8, 3, 4, 2, 1, 6, 5};
		
		for(int i : vt) {
			a.insert(i);
		}
		
		try {
			a.remove(7);
			a.remove(6);
			System.out.print("=======================\n");
			a.prefixSearch();
			System.out.print("\n=======================\n");
			a.infixSearch();
			System.out.print("\n=======================\n");
			a.postfixSearch();
			System.out.print("\n=======================\n");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
