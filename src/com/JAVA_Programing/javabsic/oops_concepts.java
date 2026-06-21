package com.JAVA_Programing.javabsic;
// class is a named  group of properties and function
public class oops_concepts {
    //syntax of a class
    class Student{
        int rollno;
        String name;
        double marks;

        Student(int rollno,String name,double marks){
            this.rollno=rollno;
            this.name=name;// (this) is act as reference variable of the  object: student1, if refers to the current object            this.name=name;
            this.marks=marks;

        }
        Student(Student s){
            this.rollno=s.rollno;
            this.name=s.name;
            this.marks=s.marks;

        }
        Student(){
            this.rollno=0;
            this.name="";
            this.marks=0;
        }

    }
    public void main(String[] args) {
        final int x=10;//we can't change or modify the value of x when it is primitive  datatype
        // to access this class and there properties by creating an object
        Student student1= new Student(13,"himanshu",89.7);// when we create this object memory of size class is allocated dynamically
        Student student2= new Student(14,"Daksh",99.7);
//        student1.rollno=12345;
//        student1.name ="Jack";     we assign value :: because we do not create any constructor
//        student1.marks=80.5;
//        Student student2= new Student();//there is no constructor with 0 arguments
        System.out.println(student1.name);
        // for assign value of others detail in an object
        Student student3= new Student(student2);
        System.out.println(student2.name);
        System.out.println(student3.name);
        final Student student4= new Student();
        student4.rollno=15;
        System.out.println(student4.rollno);


    }
}
