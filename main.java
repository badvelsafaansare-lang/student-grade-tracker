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
     System.out.println("Enter student name:");
     String name = sc.next();
     ArrayList<Integer>marks = new ArrayList<>();
     System.out.println("Enter number of subjets:");
     int n = sc.nextInt();
     for(int i = 1;i<=n;i++)
      {
        System.out.print("Enter marks for subject" + i + ":");
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
        if(mark<40)
        {
          passed = false;
          break;
        }
      }
       char grade;
       if(average>=90)
      {
        grade='A';
      }
        else if(average>=80)
        {
          grade='B';
        }
        else if(average>=70)
        {
          grade='C';
        }
        else if(average>=60)
        {
          grade='D';
        }
         else
         {
           grade = 'F';
         }
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
}

      
