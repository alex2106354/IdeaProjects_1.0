import java.util.Random;

public class RandomElement {
    private int [] arrElement;
    private int [] arrVes;

    public RandomElement(int[] arrElement, int[] arrVes) {
        this.arrElement = arrElement;
        this.arrVes = arrVes;
    }
    public int RanEl(){

        int sum = 0;
        for (int i: arrVes) {
            sum += i;
        }
        Random random = new Random();
        int r = random.nextInt(sum);
        int returnEl = 0;
        for (int i = 0; i < arrVes.length; i++) {
            if (arrVes[i]<r) {returnEl = arrElement[i];}
        }
        return returnEl;
    }
}
