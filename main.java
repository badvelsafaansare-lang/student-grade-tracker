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
    for(int s = 1;s<=students;s++)
    {
     System.out.println("\nStudent" + s);
     if(s>1)
     {
         sc.nextLine();
     }
     System.out.println("Enter student name:");
     String name = sc.nextLine();
     ArrayList<Integer>marks = new ArrayList<>();
     ArrayList<String>subjects = new ArrayList<>();
     System.out.println("Enter number of subjets:");
     int n = sc.nextInt();
     for(int i = 1;i<=n;i++)
      {
        sc.nextLine();
        System.out.print("Enter subject" + i + "name:");
        String subjectName = sc.nextLine();
        System.out.print("Enter marks for" + subjectName + ":");
        int mark = sc.nextInt();
        while(mark<0||mark>100)
        {
          System.out.println("Invald marks! Enter marks between 0 and 100.");
          System.out.print("Enter marks again:");
          mark = sc.nextInt();
        }
         subjects.add(subjectName);
         marks.add(mark);
      }
       int sum = 0;
       for(int mark : marks)
       {
        sum = sum+mark;
       }
        double average = (double)sum/marks.size();
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
    sc.close();
 }
 public static char calculateGrade(double average,boolean passed)
 {
     if(!passed)
     {
         return 'F';
     }else if(average>=85)
           {
               return 'A';          
           }else if(average>=75)
                 {
                     return 'B';
                 }else if(average>=65)
                       {
                           return 'C';
                       }else
                        {
                            return 'D';
                        }
 }
}

      


      
