package ie.atu.week5;

public class Calculator
{
    private int val1;
    private int val2;
    private int result;

    public Calculator()
    {
      val1 = 0;
      val2 = 0;
      result = 0;
    }

    public int add(int val1, int val2)
    {
        result = val1 + val2;
        return result;
    }

}
