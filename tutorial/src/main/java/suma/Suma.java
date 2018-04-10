package suma;

public class Suma {
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int sumaPrimerosNaturales(int limSup) {
		return limSup * (limSup + 1) / 2;
	}
	
	public int sumaIntervalo(int limInf, int limSup) {
		int suma = 0;
		
		if(limInf <= limSup) {
			for (int i = limInf; i <= limSup; i++) {
				suma += i;
			}
		}
		return suma;
	}
}
