package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Student;
import org.example.model.Students;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class ObjectToJson {

    public static void objectToJson() {
        Student student1 = new Student("Tural", "Samadov");
        Student student2 = new Student("Kamran", "Mammadov");
        Student student3 = new Student("Vasif", "Aliyev");
        Student student4 = new Student("Ilkin", "Suleymanov");

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);

        Students students = new Students(studentList);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(students);
            System.out.println(json);

            FileWriter file = new FileWriter("students.json");
            file.write(json);
            file.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
