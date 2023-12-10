public class Main 
{
    public static void main(String[] args) 
    {
        int result = compareNumbers(20, 5);
        System.out.println("The comparison result is " + result);
    }

    public static int compareNumbers(int num1,int num2) 
    {
        if (num1>num2)
        {
            return 1;
        }
        else if (num1<num2)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}