class Main//class name
 {
    public static int addnumbers(int num1, int num2)//method
    {
        return num1 + num2;
    }//end of method
    public static void main(String[] args)//main method
    {
        int number1 =5;//integer variable number1 with value
        int number2 =7;//integer variable number2 with value
        int result = addnumbers(number1, number2);//use method to add two numbers
        System.out.println("The sum of " + number1 +" and " + number2 + " is : " + result);//System will print the addition of two numbers
    }//end of main method
}//end of class
  