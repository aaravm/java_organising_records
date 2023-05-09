public class Main {
    public static void main(String[] args) {
        //creating new student
        student student1=new student("Aarav",'M',18,22124002,"MnC");
        student1.Display();

        System.out.println();
        //creating a new subject
        subject_stu mech1=new subject_stu("Aarsh", 'M', 18, 2214034, "Mech",2,30 );
        //using overriden method
        mech1.Display();
        //using method of interface of parent
        mech1.sethrs(3);
        mech1.home_distance(400);
        System.out.println();
        System.out.println(mech1.gethrs());
        mech1.boom();
    }
}