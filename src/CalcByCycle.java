

public class CalcByCycle
{
    public static long[] sum(int n, int N) {
        long start = System.nanoTime();
        long calc = 0;
        for(int i = 1; i < N+1; i++) {
            calc += i*n;
        }
        long finish = System.nanoTime();
        long time = finish - start;
        long[] result = new long[]{calc, time};
        return result;
    }
}

