//Cameron Priestley 
////11/21/16

// -employeesId []: int
// -hours []: int
// -payRate []: double
// -grossWages: double
// -i: int
// -secondId []: int
// 
// +employeeId(): void 
// +getEmployeeId(): void
// +getAllEmloyee(): void
// +getWages(): void

public class Payroll
{

    int[] employeesId = {56588, 45201, 78951, 87775, 84512, 13028, 75804};
    int[] hours      = {40, 41, 42, 43, 44, 45, 46};
    double[] payRate = {13.60, 13.50, 13.40, 13.30, 13.20, 13.10, 13.00};
    double[] grossWages = {544.00, 553.50, 562.80, 571.90, 580.80, 589.50, 598.00};

    double[] wages = new double[7];

    int i = 0;
    int[] secondId= new int[7];

   
    public Payroll()
    {

        
        
    }

    //     public int getId(){
    //     
    //     
    //     return ;
    //     }
    public void employeeId(){

        for(i = 0; i< employeesId.length; i++){
            employeesId[i] = secondId[i];
        }
    
    }

    public void getAllEmployee(){

        for(i = 0; i< employeesId.length; i++){

            System.out.println("employeeId" + "\t" + "hours" + "\t\t" + "payRate" + "\t\t" + "wages");
            System.out.printf(employeesId[i] +  "\t\t" + hours[i] + "\t\t" + payRate[i] + "\t\t" + "%.2f\n", grossWages[i]);

        }

    }
    public void getWages(int ID){
        for(i  = 0; i < employeesId.length; i++){
            if(ID == employeesId[i]){
       
                System.out.println("employeeId" + "\t" + "hours" + "\t\t" + "payRate" + "\t\t" + "wages");
                System.out.printf(employeesId[i] +  "\t\t" + hours[i] + "\t\t" + payRate[i] + "\t\t" + "%.2f\n", grossWages[i]);

            }
        
        }

    }
    

}
