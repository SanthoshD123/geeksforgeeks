class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}
