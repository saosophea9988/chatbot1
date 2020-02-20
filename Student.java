public class Student {
    private int sno;
    private String firstname;

    public Student(){}
    public Student(int sno , String firstname){
        this.sno = sno;
        this.firstname = firstname;
    }

    public int getSno(){ return sno;}
    public String getFirstname(){return firstname;}

    public void setSno(int sno){ this.sno=sno;}
    public void setFirstname(String firstname){this.firstname=firstname;}
}
