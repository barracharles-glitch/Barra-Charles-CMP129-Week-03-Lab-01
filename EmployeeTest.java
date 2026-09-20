public class EmployeeTest {
    public static void main(String[]args){
        Employee employee1 = new Employee(47899, "Susan Meyres", "Accounting", "Vice President");
        Employee employee2 = new Employee(39119, "Mark Jones", "IT", "Programming");
        Employee employee3 = new Employee(81774, "Joy Rogers", "Manufacturing", "Engineer");

        System.out.println("----------------------------------------------------------\n"+
                            "|  Name  |    Id Number    |   Department   |   Position |\n"+
                            "----------------------------------------------------------\n"+
                            employee1.getName()+"   |   "+employee1.getidNumber()+"   |   "+employee1.getDepartment()+ "   |   "+employee1.getPosition()+"\n"+
                            employee2.getName()+"     |   "+employee2.getidNumber()+"   |   "+employee2.getDepartment()+ "   |   "+employee2.getPosition()+"\n"+
                            employee3.getName()+"     |   "+employee3.getidNumber()+"   |   "+employee3.getDepartment()+ "   |   "+employee3.getPosition()+"\n"+
                            "----------------------------------------------------------"
        );
    }
}
