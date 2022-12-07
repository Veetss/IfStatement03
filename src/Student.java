import java.util.Random;

public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(){
        Random a = new Random();
        int randomNum = a.nextInt((35 - 0) + 1) + 0;
        System.out.println("I generated the number " + randomNum + " for the student " + name + "!");

        if(randomNum == age){
            System.out.println("The age (" + age + ") is equal to the random number!" );
        }else if(randomNum > age){
            System.out.println("The random number is greater then my age! - " + age);
        }else{
            System.out.println("The random number is lower then my age! - " + age);
        }
    }
}
