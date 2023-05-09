class student extends person implements child
{

    private int RollNo;
    String branch;
    //polymorphism
    student(String name, char sex, int age, int RollNo, String branch)
    {
        super(name, sex, age); // calls parent class's constructor with 3 arguments
        this.RollNo = RollNo;
        this.branch = branch;
    }
    void Display() // Method Overriding
    {
        System.out.println("Roll No = "+RollNo);
        System.out.println("Name = "+getName());
        System.out.println("Sex = "+sex);
        System.out.println("Age = "+age);
        System.out.println("Branch = "+branch);
    }

    int home;
    int time;

    @Override
    public void home_distance(int a) {
        this.home=a;
        System.out.print(a);
    }

    @Override
    public void time_parents(int a) {
        this.time=a;
    }
}