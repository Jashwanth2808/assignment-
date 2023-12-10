public class Main {
    public static void main(String[] args) {
        calculateSum(5);
    }

    public static void calculateSum(int n) {
        int sum=0,i;
        for (i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of the natural numbers from 1 to " +n+ " is " + sum);
    }
}