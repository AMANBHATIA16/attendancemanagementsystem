package model;

public class Student {
    private int studentId;
    private String name;
    private String course;

    public Student() {}

    public Student(int studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

