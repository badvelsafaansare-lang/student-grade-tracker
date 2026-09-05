import java.util.ArrayList;
public class Main{
  public staic void main(String[] args)
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
    for(int marks : marks){
      sum = sum+marks;
    }
    double average = (doible)sum/marks.size();
    System.out.println("Average marks: " + average);
    int highest = marks,get(0);
    int lowest = marks,get(0);

    for(int marks : marks)
      {
        if (marks > highest)
        {
          highest marks = marks;
        }
        if(marks < lowest)
        {
          lowest marks = marks;
        } 
  }
    System.out.println("Highest marks:" + highest);
    System.out.println("Lowest marks:" + lowest)'
}  
      
