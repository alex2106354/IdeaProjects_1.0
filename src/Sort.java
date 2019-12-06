import java.util.Arrays;
import java.util.Random;

public class Sort {
    private double[] mas;

    public Sort(int j) {
        mas = new double[j];

        for (int i = 0; i < j; i++) {mas[i] = new Random().nextDouble();}

        System.out.println(Arrays.toString(mas));
    }
    public double MinSort() {
        double prev = 1;

        for (double iter : mas) {if (iter < prev) { prev = iter;}}
       // Arrays.sort(mas);
        System.out.println("сортировка типовая - " + mas[0]);
        return prev;
    }

    public double MaxSort() {
        double prev = 0;

        for (double iter : mas) {if (iter > prev) {prev = iter;}}
       // Arrays.sort(mas);
        System.out.println("сортировка типовая - " + mas[mas.length-1]);
        return prev;
    }

    public double AVGSort() {
        double sum = 0;
        for (double iter : mas) {sum = sum + iter;}
        return sum/mas.length;
    }

    public void Sort1() {

        int n = mas.length-1;
        double buf = 0.0;
        int f = 0;

        for(int i = 0; i < n; i++){
            //f = 0;
            for(int j = 0; j < n - i; j++){
                if (mas[j] > mas[j+1]) {
                    buf = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = buf;
              //      f = 1;
                }

            }
            //if (f=0) break;
        }

        //for (double iter : mas) {sum = sum + iter;}
        //return 0.0;
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}