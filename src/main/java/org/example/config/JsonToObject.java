package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Student;
import org.example.model.Students;

import java.io.File;
import java.util.List;

public class JsonToObject {

    public static void jsonToObject() {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Students students = objectMapper.readValue(new File("students.json"), Students.class);
            List<Student> studentList = students.getStudents();

            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
