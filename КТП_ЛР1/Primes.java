public class Primes {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i) == true)
				System.out.println("Это простое число " + i);
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
