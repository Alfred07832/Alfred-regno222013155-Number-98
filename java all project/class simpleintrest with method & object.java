class simpleintrest//class name
{
    public static double calculateSI(double p, double r, double t)// method to be used
    {
        return p*r*t;
    }//end of method
}//end of class

class objects//class name
 {
    public static void main(String[] args)//main methode
    {
        //create an instance of the simpleintrest class

        simpleintrest mySI = new simppleintrest();

        //use the calculateSI method to multiply three numbers

          double result = mySI.calculateSI(p=100000,r=0.05,t=5);
          System.out.println(" Result: " + result);
    }//end of main methode
}//end of class
