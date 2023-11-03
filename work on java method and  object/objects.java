class simpleintrest
{
    public double calculateSI(double p, double r, double t){
        return p*r*t;
    }
}

public class objects {
    public static void main(String[] args)
    {
        //create an instance of the simpleintrest class

        simpleintrest mySI = new simpleintrest();

        //use the calculateSI method to multiply three numbers

          double result = mySI.calculateSI(100000, 0.05, 5);
          System.out.println(" Result: " + result);
    }
}
