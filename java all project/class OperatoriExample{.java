class OperatoriExample//class name
{  
public static void main(String args[])//main method
{  
int a=10;  //integer variable a with value
int b=5;  //integer variable b with value
int c=20; //integer variable c with value 
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
}//end of main method
}  //end of class