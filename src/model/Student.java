package model;

/**
 * 学生情報クラス
 */
public class Student {

    private String studentNumber; // 学生番号
    private String studentName; // 学生名

    public Student(String studentNumber, String studentName) {
        super();
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



}