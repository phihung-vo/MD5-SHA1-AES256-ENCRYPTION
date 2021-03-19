package qlsv;


public class Staff {
    
    private String staffcode, fullname, email, salary;
    
    public Staff(){}
    public Staff(String staffCode, String fullName, String mail, String slr){
        super();
        this.staffcode = staffCode;
        this.fullname = fullName;
        this.email = mail;
        this.salary = slr;
    }
    
    public String getStaffCode(){
        return staffcode;
    }
    public String getFullName(){
        return fullname;
    }
    public String getEmail(){
        return email;
    }
    public String getSalary(){
        return salary;
    }
}
