class simpleintrest//class name
{
    public static double calculateSI(double p, double r, double t)//method tobe used
    {
        return p*r*t;
    }//end of methode
}// end of class

class objects //objects
{
    public static void main(String[] args)//main method
    {
        //create an instance of the simpleintrest class

        simpleintrest mySI = new simppleintrest();

        //use the calculateSI method to multiply three numbers

          double result = mySI.calculateSI(p=100000,r=0.05,t=5);
          System.out.println(" Result: " + result);
    }//end of main method
}//end of class
