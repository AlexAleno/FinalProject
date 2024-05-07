package ProjectCom;

public class Instructor extends Person{
    private String officeNumber;

    public Instructor(String name, String familyName, String officeNumber) {
        this.officeNumber = officeNumber;
        super.setName(name);
        super.setFamilyName(familyName);
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    public String toString(){
        return "\nName: "+super.getName()+"\nFamily Name: "+super.getFamilyName()+"\nOffice Number: "+officeNumber;
    }
}
