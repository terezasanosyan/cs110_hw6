package Utils;


public class Math {

     public static int  factorial(int num)  {


        if(num<=1)
            return 1;

        return num*factorial(num-1);

    }

    public static long factorialLoop(int num)  {

        int factorial=1;

        for ( int i=2; i<=num; i++)

            factorial*=i;

        return factorial;
    }
}
