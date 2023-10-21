
/* 2.
Write a Java Program to implement the concept of multiple inheritance using Interfaces*/

interface student{
    void name(String name);
    void age(int age);
}
interface education{
    void print();
}
public class MultipleInterface implements student,education{
    @Override
    public void name(String name) {
        System.out.println("Student Name : "+name);
    }
    @Override
    public void age(int age) {
        System.out.println("Student Age    : "+age);
    }
    @Override
    public void print() {
        System.out.println("Student Details");
    }
    public static void main(String[] args) {

        MultipleInterface obj=new MultipleInterface();
        obj.print();
        obj.name("Bhoopathi");
        obj.age(17);
    }
}
