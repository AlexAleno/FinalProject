package com.example.finalproject;

import ProjectCom.Course;
import ProjectCom.CourseRegistrationInfo;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class CourseManagementDemo extends Application {

    static ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane main = new BorderPane();
        VBox pane = new VBox();
        VBox list = new VBox();
        HBox buttons = new HBox();
main.setCenter(pane);
        pane.setAlignment(Pos.CENTER);
        buttons.setAlignment(Pos.CENTER);
main.setPadding(new Insets(0,10,10,50));
        Button sortBT = new Button("Sort Courses");
        sortBT.setPadding(new Insets(   10,30,10,30));
        sortBT.setStyle("fx-border-color: black;");
        Button displayBT = new Button("Display Courses");
        displayBT.setPadding(new Insets(10,30,10,30));
        sortBT.setStyle("fx-border-color: black;");
        pane.getChildren().addAll(buttons,list);
        buttons.getChildren().addAll(displayBT,sortBT);
displayBT.setOnAction(e -> {
    list.getChildren().clear();
        for(int i=0;i<courseList.size();i++) {
            Text text = new Text(courseList.get(i).toString());
            list.getChildren().add(text);
        }});
        buttons.setPadding(new Insets(15,5,5,5));
        sortBT.setOnAction(e -> {
            Collections.sort(courseList);
            list.getChildren().clear();
            for(int i=0;i<courseList.size();i++) {
                Text text = new Text(courseList.get(i).toString());
                list.getChildren().add(text);
            }});



        Scene scene = new Scene(main,900,600);
        stage.setTitle("Course List");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Alexandre Noël\\IdeaProjects\\FinalProject\\src\\main\\java\\ProjectCom\\coursedata.txt";

        CourseRegistrationInfo.readList(path,courseList);
        launch();


    }


}