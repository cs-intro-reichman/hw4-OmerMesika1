public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int limit = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[limit+1];
        int counter = 0;
        if (limit>=2) {
            primes[1] = false;
            primes[2] = true;
            primes[3] = true;
        }
        for(int i=3;i<primes.length;i++) {
             primes[i] = true;
        }
        for(int i=2;i<Math.sqrt(primes.length);i++) {
           for(int j=i;j<primes.length;j++) {
            if (j%i==0 && j!=i) {
                primes[j] = false;
            }
           }
        }
        for(int x=0;x<primes.length;x++) {
            if (primes[x]) {
                counter++;
                System.out.println(x);
            }
        }
        int ratio = (counter*100)/limit;
           System.out.println("There are " + counter + " primes between 2 and " + limit + " (" + ratio + "% are primes)");
    }
}