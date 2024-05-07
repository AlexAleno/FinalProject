package ProjectCom;



public class Course implements Comparable<Course>{
    private String courseNumber;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String courseNumber, Instructor instructor, TextBook textBook) {
        this.courseNumber = courseNumber;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }
    public String toString(){
        return "\nCourse Number:\n"+courseNumber+"\nInstructor:"+instructor.toString()+"\nText Book:\n"+textBook;
    }
@Override
public int compareTo(Course o){
if (o.getCourseNumber().compareTo(getCourseNumber())<getCourseNumber().compareTo(o.getCourseNumber())){
    return 1;
}
else if(o.getCourseNumber().compareTo(getCourseNumber())>getCourseNumber().compareTo(o.getCourseNumber())){
    return -1;
    }
    else{
        return 0;
    }
}

}


