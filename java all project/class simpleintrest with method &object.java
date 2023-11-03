class simpleintrest
{
    public static double calculateSI(double p, double r, double t){
        return p*r*t;
    }
}

class objects {
    public static void main(String[] args)
    {
        //create an instance of the simpleintrest class

        simpleintrest mySI = new simppleintrest();

        //use the calculateSI method to multiply three numbers

          double result = mySI.calculateSI(p=100000,r=0.05,t=5);
          System.out.println(" Result: " + result);
    }
}
