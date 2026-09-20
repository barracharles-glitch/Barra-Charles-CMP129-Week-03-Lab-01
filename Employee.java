public class Employee {
    private int idNumber;
    private String name, department, position;

    public Employee (int i, String n, String d, String p){
        idNumber = i;
        name = n;
        department = d;
        position = p;
    }

    public Employee (int i, String n){
        idNumber = i;
        name = n;
        department = "";
        position = "";
    }

    public Employee (){
        idNumber = 0;
        name = "";
        department = "";
        position = "";
    }

    public void setidNumber(int i){
        idNumber = i;
    }

    public void setName(String n){
        name = n;
    }

    public void setDepartment(String d){
        department = d;
    }

    public void setPosition(String p){
        position = p;
    }

    public int getidNumber(){
        return idNumber;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public String getPosition(){
        return position;
    }
}
