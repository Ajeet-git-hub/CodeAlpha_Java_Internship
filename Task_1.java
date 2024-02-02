import java.util.Scanner;

//student class
class Student{
    private String name;
    private int math, science,english,hindi, socialScience, highest, lowest;
    private float average;
    Scanner sc = new Scanner(System.in);

    //constructor
    Student(){
        System.out.print("Student's Name: ");
        name = sc.nextLine();
        marksInput();
    }

    // to take input of name and marks
    private void marksInput(){
        System.out.println("Enter the marks.");
        System.out.print("Math: ");
        math = sc.nextInt();
        System.out.print("Science: ");
        science = sc.nextInt();
        System.out.print("English: ");
        english = sc.nextInt();
        System.out.print("Hindi: ");
        hindi = sc.nextInt();
        System.out.print("Social Science: ");
        socialScience = sc.nextInt();
        highest();
        average();
        lowest();
    }

    //to find the average of all subjects
    void average(){
        average = (math + science + english + hindi + socialScience)/5;
    }

    //to find the highest mark among all
    void highest(){
        highest = math;
        if(highest < science ){
            highest = science;
        }
        if(highest < english){
            highest = english;
        }
        if(highest < hindi){
            highest = hindi;
        }
        if(highest < socialScience){
            highest = socialScience;
        }
    }

    //to find the lowest mark among all subjects
    void lowest(){
        lowest = math;
        if(lowest > science){
            lowest = science;
        }
        if(lowest > english){
            lowest = english;
        }
        if(lowest > hindi){
            lowest = hindi;
        }
        if(lowest > socialScience){
            lowest = socialScience;
        }

    }

    //to print the result of a student
    void printResult(){
        System.out.println();
        System.out.println("---------------------"+name+"-----------------------");
        System.out.println("Subject                                  marks");
        System.out.println();
        System.out.println("Math                                     "+ math);
        System.out.println("Science                                  " + science);
        System.out.println("English                                  " + english);
        System.out.println("Hindi                                    " + hindi);
        System.out.println("Social Science                           " + socialScience);
        System.out.println("_____________________________________________________");
        System.out.println("Average: " + average + "  \tHighest: " + highest + "  \tLowest: " + lowest);
        System.out.println("-----------------------------------------------------\n");
    }
}

//class contains main method
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Result of How many students ??? : ");
        num = sc.nextInt();
        Student arr[] = new Student[num];
        for(int i = 0; i < num; i++){
            arr[i] = new Student();
            arr[i].printResult();
        }
    }
}
