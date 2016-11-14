//Cameron Priestley 
//11/13/2016
public class TestScoreCreate
{
   public static void main(String[] args){
    
    TestScore one = new TestScore(11222435, 89, 85, 80);
    TestScore two = new TestScore(13325230, 50, 60, 95);
    TestScore three = new TestScore(11222436, 77, 39, 95);
    
    System.out.println("ID" + "\t\t" + "Test1" + "\t\t" + "Test2" + "\t\t" + "Test3" + "\t\t" + "Average");
    one.printTestMethod();
    two.printTestMethod();
    three.printTestMethod();
    
    
    }
}
