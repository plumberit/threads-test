

public class CalcByFormula
{
    public static long[] sum(int n, int N) {
        long start = System.nanoTime();
        float calc = ((2*n + n*(N - 1)) * N) / 2f;
        long finish = System.nanoTime();
        long time = finish - start;
        long[] result = new long[]{(long)calc, time};
        return result;
    }
}
