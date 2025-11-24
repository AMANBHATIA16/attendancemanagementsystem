package service;

import dao.StudentDAO;
import dao.AttendanceDAO;
import model.Student;
import model.Attendance;

import java.time.LocalDate;
import java.util.List;

public class AttendanceService {

    private StudentDAO studentDAO;
    private AttendanceDAO attendanceDAO;

    public AttendanceService(StudentDAO sDao, AttendanceDAO aDao) {
        this.studentDAO = sDao;
        this.attendanceDAO = aDao;
    }

    public boolean addStudent(String name, String course) {
        Student s = new Student(name, course);
        return studentDAO.addStudent(s);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public boolean markAttendance(int id, String status) {
        Attendance a = new Attendance(id, LocalDate.now(), status);
        return attendanceDAO.markAttendance(a);
    }

    public List<Attendance> viewAttendance(int studentId) {
        return attendanceDAO.getAttendanceByStudent(studentId);
    }
}

