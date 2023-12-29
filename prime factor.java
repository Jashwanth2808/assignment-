public class PrimeFactor {

    public static void primeFactorial(int num) 
    {
        if (num<2||num>100)
        {
            System.out.println("Invalid number");
            return;
        }
        for (int i=2;i<=num;i++) 
        {
            while (num % i== 0)
             {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
    public static void main(String[] args) 
    {
        primeFactorial(12);
    }
}