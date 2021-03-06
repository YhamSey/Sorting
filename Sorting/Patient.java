public class Patient {  

    public Patient(String fName,String lName,int age,String address){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
    }
      public String getFullname(){
      return this.fName + " " + this.lName;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public String toString(){
        return getFullname() + ", " + getAge() + ", " + getAddress();
    }  
    private String fName;
    private String lName;
    private int age;
    private String address;
}