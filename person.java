class person
{
    private String name;
    protected char sex; // note protected
    public int age;
    person()
    {
        name = null;
        sex = 'U'; // unknown
        age = 0;
    }
    person(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    String getName()
    {
        return name;
    }
    void Display()
    {
        System.out.println("Name = "+name);
        System.out.println("Sex = "+sex);
        System.out.println("Age = "+age);
    }
    void boom(){
        System.out.println("Name = "+name+" boom");
    }
}