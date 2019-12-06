import java.util.Random;

public class vector {
    private final int x;
    private final int y;
    private final int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double m1(vector a){
        return Math.sqrt(a.getX() * a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ());
    }


    public int m2(vector a, vector b){
        return a.getX() * b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ();
    }


    public vector m3(vector a, vector b){
        return  new vector(a.getY()*b.getZ() - a.getZ()*b.getY(), a.getZ()*b.getX() - a.getX()*b.getZ(), a.getX()*b.getY() - a.getY()*b.getX());
    }


    public double m4(vector a, vector b){
        return  m2(a, b)/ (Math.abs(m1(a)) * Math.abs(m1(b)));
    }


    public vector m5(vector a, vector b){
        return  new vector(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
    }


    public vector m6(vector a, vector b){
        return  new vector(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
    }

    public static vector[] m7(int N){
        vector[] vectors = new vector[N];

        Random random = new Random();

        for (int i = 0; i < N; i++) {
            vectors[i] = new vector(random.nextInt(), random.nextInt(), random.nextInt());
        }

        return vectors;
    }
}
