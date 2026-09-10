import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students:");
    int students = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter number of subjects:");
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<String>subjects = new ArrayList<>();
    for(int i = 1;i<=n;i++)
    {
        System.out.print("Enter subject " + i + "name: ");
        String subjectName = sc.nextLine();
        subjects.add(subjectName);
    }
    ArrayList<String>studentNames = new ArrayList<>();
    ArrayList<Double>studentAverages = new ArrayList<>();
    ArrayList<Boolean>studentResults = new ArrayList<>();
    ArrayList<ArrayList<Integer>> studentMarks = new ArrayList<>();
    for(int s = 1;s<=students;s++)
    {
     System.out.println("\nStudent" + s + "---");
     if(s>1)
     {
         sc.nextLine();
     }
     System.out.println("Enter student name:");
     String name = sc.nextLine();
     ArrayList<Integer>marks = new ArrayList<>();
     for(int i = 1;i<=n;i++)
      {
        System.out.print("Enter marks for " + subjects.get(i - 1) + " : ");
        int mark = sc.nextInt();
        while(mark<0||mark>100)
        {
          System.out.println("Invald marks! Enter marks between 0 and 100.");
          System.out.print("Enter marks again:");
          mark = sc.nextInt();
        }
         marks.add(mark);
      }
       int sum = 0;
       for(int mark : marks)
       {
        sum = sum+mark;
       }
        double average = (double)sum/marks.size();
        studentNames.add(name);
        studentAverages.add(average);
        studentMarks.add(marks);
        int highest = marks.get(0);
        int lowest = marks.get(0);

       for(int mark : marks)
      {
        if (mark > highest)
        {
          highest = mark;
        }
        if(mark < lowest)
        {
          lowest = mark;
        } 
      }
       boolean passed = true;
       for(int mark:marks)
      {
        if(mark<35)
        {
          passed = false;
          break;
        }
      }
      studentResults.add(passed);
       char grade = calculateGrade(average,passed);
         System.out.println("\n---Student Result---");
         System.out.println("Student Name:" + name);
         System.out.println("Marks:" + marks);
         System.out.println("Average Marks:" + average);
         System.out.println("Highest Marks:" + highest);
         System.out.println("Lowest Marks:" + lowest);
         if(passed)
         {
           System.out.println("Result: Pass");
         }else
          { 
            System.out.println("Result: Fail");  
          }
          System.out.println("Grade:" + grade);
    }
    System.out.println("\n---Final Ranking ---");
    boolean[] ranked = new boolean[students];
    for(int rank = 1;rank<=students;rank++)
    {
        int bestIndex = -1;
        for(int i=0;i<students;i++)
        {
            if(!ranked[i] && (bestIndex ==-1 ||studentAverages.get(i) > studentAverages.get(bestIndex)))
            {
                bestIndex = i;
            }
        }
        System.out.println("Rank " + rank + ":" + studentNames.get(bestIndex) + "-Average: " + studentAverages.get(bestIndex));
       ranked[bestIndex] = true;
    }
    System.out.println("\n--- Search Student ---");
    sc.nextLine();
System.out.print("Enter student name to search: ");
String searchName = sc.nextLine();

boolean found = false;

for (int i = 0; i < studentNames.size(); i++) {

    if (studentNames.get(i).equalsIgnoreCase(searchName)) {

        System.out.println("Student Found!");
        System.out.println("Name: " + studentNames.get(i));
        System.out.println("Average: " + studentAverages.get(i));

        found = true;
        break;
    }
}

if (!found) {
    System.out.println("Student not found.");
}

System.out.println("\n--- Class Topper ---");

int topperIndex = 0;

for (int i = 1; i < studentAverages.size(); i++) {

    if (studentAverages.get(i) > studentAverages.get(topperIndex)) {
        topperIndex = i;
    }
}

System.out.println("Topper: " + studentNames.get(topperIndex));
System.out.println("Highest Average: " + studentAverages.get(topperIndex));

System.out.println("\n--- Final Class Summary ---");

int passedStudents = 0;
int failedStudents = 0;

for (boolean result : studentResults) {

    if (result) {
        passedStudents++;
    } else {
        failedStudents++;
    }
}

System.out.println("Total Students: " + students);
System.out.println("Passed Students: " + passedStudents);
System.out.println("Failed Students: " + failedStudents);
System.out.println("Class Topper: " + studentNames.get(topperIndex));
System.out.println("Highest Average: " + studentAverages.get(topperIndex));

    sc.close();
 }
 public static char calculateGrade(double average,boolean passed)
 {
     if(!passed)
     {
         return 'F';
     }else if(average>=75)
           {
               return 'A';          
           }else if(average>=65)
                 {
                     return 'B';
                 }else if(average>=35)
                       {
                           return 'C';
                       }else
                        {
                            return 'D';
                        }
 }
}      
