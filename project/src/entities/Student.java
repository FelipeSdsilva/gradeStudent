package entities;

public class Student {
    
    public String name;
    public double grade1, grade2, grade3;

    public double totalGrade()
    {
        return grade1 + grade2 + grade3;
    }
    public void finalGrade()
    {
        if(totalGrade() >= 60.00)
        {
            System.out.println("Final Grade= "+totalGrade());
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Final Grade= "+totalGrade());
            System.out.println("Failed");
            System.out.println("Missing "+(60-totalGrade())+" Points");
        }

    }


}
