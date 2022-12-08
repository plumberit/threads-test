

public class CalcByCycleInMultiThread
{
    public static long[] sum(int n, int N, int k)
    {
        long start = System.nanoTime();
        int threadIterationsNumber = (int) Math.ceil((float)N/(float)k);
        int lastThreadIterationsNumber = N - (k - 1) * threadIterationsNumber;

        CalcRunnable[] runnables = new CalcRunnable[k];
        Thread[] threads = new Thread[k];


        Runnable r;
        Thread t;

        long progressionSum = 0;

        for(int i = 0; i < k; i++)
        {
            r = runnables[i] = new CalcRunnable(i*threadIterationsNumber + 1, n, threadIterationsNumber);
            t = threads[i] = new Thread(r);
            t.start();
        }
        r = runnables[k-1] = new CalcRunnable((k-1)*threadIterationsNumber + 1, n, lastThreadIterationsNumber);
        t = threads[k-1] = new Thread(r);
        t.start();

       try
        {
            for(int i = 0; i < k; i++)
            {
                threads[i].join();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        for(int i = 0; i < k; i++)
        {
            progressionSum += runnables[i].getResult();
        }

        long finish = System.nanoTime();
        long time = finish - start;
        long[] result = new long[]{progressionSum, time};
        return result;
    }
}
