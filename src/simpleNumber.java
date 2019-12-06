public class simpleNumber {
    public void simple(){
        int from = 2;
        int to = 100;

        int n;
        boolean isPrime;
        int i;

        for (i = from; i <= to; i++) {
            n = 2;
            isPrime = true;
            while (i > n) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }else n++;
            }
            if (isPrime) System.out.println("Простое число - " + i);
        }
    }
}
