package view;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		
		
		
		for (int i = 1; i < 6; i++){
			Thread sapo = new ThreadSapo(i);
			sapo.start();
		}
		

	}

}
