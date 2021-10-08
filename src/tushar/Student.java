package tushar;

public class Student {
    String name;
    int id;
    static String universityName;
    Student(int id)
    {
        this.id=id;

        System.out.println("ID: "+id);
    }
    Student(String name)
    {
        this.name=name;
        System.out.println("Name "+name);
    }
    Student()
    {
        universityName="Leading University";
    }
    void display()
    {
        System.out.println("Institution : "+universityName);
    }
}

/*
    Name: MD.Ashikur Rahman Tushar
    Id:  2012020135
    Section: 'C'
    Email: tushufish9@gmail.com
    Date:   6th August 2021.
 */
