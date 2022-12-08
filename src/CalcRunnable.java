

public class CalcRunnable implements Runnable
{
    int start;
    int n;
    int range;

    long calc = 0;

    public CalcRunnable(int start, int n, int range)
    {
        this.start = start;
        this.n = n;
        this.range = range;
    }

    @Override
    public void run()
    {
        for(int i = start; i < start + range; i++)
        {
            calc += i * n;
        }
    }
    public long getResult()
    {
        return calc;
    }
}
