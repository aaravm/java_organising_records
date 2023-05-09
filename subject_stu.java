public class subject_stu extends student{

    private int hours =0;
    private int marks=0;
    subject_stu(String name, char sex, int age, int RollNo, String branch, int hours, int marks){
        super(name, sex, age, RollNo,branch);
        this.marks=marks;
        this.hours=hours;
    }
    void sethrs(int h){
        this.hours=h;
    }
    int gethrs(){
        return hours;
    }
    void exammarks(int a){
        this.marks=a;
    }


}
