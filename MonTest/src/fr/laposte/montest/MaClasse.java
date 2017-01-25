package fr.laposte.montest;

public class MaClasse {

	static public int monCalcul(int a, int b){
		int res = a + b;
		
		if (a == 0) {
			res = b * 2;
		}
		
		if (b == 0) {
			res = a * a;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(MaClasse.monCalcul(2, 0));
		System.out.println(MaClasse.monCalcul(0, 3));
		System.out.println("hello");

	}

}
