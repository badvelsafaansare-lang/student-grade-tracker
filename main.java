import java.util.ArrayList;
public class Main{
  public static void main(String[] args)
  {
    String name = "safa";
    ArrayList<Integer>marks = new ArrayList<>();
    marks.add(85);
    marks.add(72);
    marks.add(90);
    System.out.println("student grade tracker");
    System.out.println("student name is:" + name);
    System.out.println("Marks:" + marks);
    int sum = 0;
    for(int mark : marks){
      sum = sum+mark;
    }
    double average = (double)sum/marks.size();
    System.out.println("Average marks: " + average);
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
    System.out.println("Highest marks:" + highest);
    System.out.println("Lowest marks:" + lowest);
    boolean passed = true;
    for(int mark:marks)
      {
        if(mark<40)
        {
          passed = false;
          break;
        }
      }
    if(passed)
    {
      System.out.println("Result:pass");
    }
    else{
      System.out.println("Result :Fail");
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
    else{
      grade = 'F';
    }
    System.out.println("Grade:" + grade);
 } 
}
      
