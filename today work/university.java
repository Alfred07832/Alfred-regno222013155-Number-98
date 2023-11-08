class university
{
     public String name= "UR";
    public void fullname()
    {
        System.out.println("UNIVERSITY OF RWANDA ");
    }
}
class compus extends university
{
    String compusname="  Gikondo compus ";
    public void location()
    {
        System.out.println("gikondo mburabuturo");
    }
}
class college extends compus
{
    String collagename=" COLLEGE OF BUSINESS AND ECONOMICS ";

}
class school extends college 
{
    String schoolname="SCHOOL OF BUSINESS";
}
class department extends school
{
    String departmentname=" BUSINESS INFORMATION TECHNOLOGY";
}
class marks extends department 
{
    String markname=" ENGLISH MARKS";
    public void mk()
    {
        System.out.println("78");
    }

    public static void main(String[] args)
    {
        marks obj= new marks();
        obj.fullname();
        System.out.println(obj.name);
        obj.location();
        System.out.println(obj.compusname);
        System.out.println(obj.collagename);
        System.out.println(obj.schoolname);
        System.out.println(obj.departmentname);
        System.out.println(obj.markname);
        obj.mk();
    }
}