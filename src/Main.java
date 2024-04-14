//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student{

    String name;
    int marks;

    Student(String name,int marks)
    {
        this.name=name;
                this.marks=marks;

    }
    public int getMarks()
    {
        return marks;
    }
    public String toString()
    {
        return "Name is"+this.name+" marks is"+this.marks;
    }
}
public class Main {
    public static void main(String[] args) {

       String s="Harsh";


       List<Student> list1=Arrays.asList(new Student("Harsh",36),new Student("Himan",30),
               new Student("hh",49));
        list1.stream().map(x->{
            if(x.marks>35)
                return x;
            else
                return new Student(x.name,x.marks+5);
        }).forEach(System.out::println);
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put(null,1);
        h1.put(null,2);
        System.out.print(h1);

        //Finding student who has second highest salary

//        list1.stream().sorted((x,y)->x.marks-y.marks).limit(2).findAny(2).m;










    }
}