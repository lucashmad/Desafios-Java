package Application;

public class Student {
    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteTree;

    public double finalGrade(){
        return noteOne + noteTwo + noteTree;
    }

    public double missingPoints(){
        if(finalGrade() < 60.0 ) {
            return 60.0 - finalGrade();
        }
            else {
                return 0.0;
        }
    }
}
