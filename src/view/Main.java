package view;

import controller.Thready;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			Thread t = new Thready(i);
			t.start();
		}
	}

}