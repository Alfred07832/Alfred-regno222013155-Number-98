class simbleintrest// class name
{
    public static double calculateSI(double p, double r, double t)//method
    {
        return p*r*t;
    }
public static void main (String args[])// main method
{
    double principle =100000;//doule variable principle with their value
    double rate =0.05;// variable rate with their value
    double time =5;// variable time with their value
    double result = calculateSI(principle, rate, time);//use the method to calculate Simple interest
    System.out.println("The simple intrest of Mr bob is = " + principle +" and "+ rate + " and " + time + " is :" + result);// The system will print the value of simple interest
}
}