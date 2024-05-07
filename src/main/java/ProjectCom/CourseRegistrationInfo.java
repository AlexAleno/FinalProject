package ProjectCom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationInfo {
    public static void readList(String path,ArrayList<Course> courseList) throws IOException {
        DataInputStream dataIN = new DataInputStream(new FileInputStream(path));
        while(dataIN.available() !=0) {
            String data = dataIN.readLine();
            String[] parts = data.split(" ");
            String data2 = dataIN.readLine();
            String data3 = dataIN.readLine();
            courseList.add(new Course(parts[0], new Instructor(parts[1], parts[2], parts[3]), new TextBook(data2, data3)));
        }

    }

}
