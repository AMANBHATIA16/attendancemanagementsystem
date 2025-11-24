package dao;

import java.sql.*;
import java.util.*;
import model.Student;

public class StudentDAO {

    private Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean addStudent(Student student) {
        String sql = "INSERT INTO students(name, course) VALUES (?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getCourse());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("student_id"),
                        rs.getString("name"),
                        rs.getString("course")
                );
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE student_id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("student_id"),
                        rs.getString("name"),
                        rs.getString("course")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

