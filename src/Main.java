
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Progression progression = new Progression(8, 1234);
        process(progression);
    }

    public static void process(Progression p)
    {
        System.out.println("Formula: " + Arrays.toString(CalcByFormula.sum(p.getn(),p.getN())));
        System.out.println("Cycle: " + Arrays.toString(CalcByCycle.sum(p.getn(),p.getN())));
        System.out.println("Cycle in 2 threads: " + Arrays.toString(CalcByCycleInMultiThread.sum(p.getn(),p.getN(),2)));
        System.out.println("Cycle in 4 threads: " + Arrays.toString(CalcByCycleInMultiThread.sum(p.getn(),p.getN(),4)));
        System.out.println("Cycle in 8 threads: " + Arrays.toString(CalcByCycleInMultiThread.sum(p.getn(),p.getN(),8)));
        System.out.println("Cycle in 16 threads: " + Arrays.toString(CalcByCycleInMultiThread.sum(p.getn(),p.getN(),16)));
        System.out.println("Cycle in 32 threads: " + Arrays.toString(CalcByCycleInMultiThread.sum(p.getn(),p.getN(),32)));
       

    }
}
