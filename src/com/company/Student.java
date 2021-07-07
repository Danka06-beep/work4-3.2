package com.company;

public class Student {
    String name;
    String group;
    String StudentId;

    public Student(String name,String group,String StudentId) {
        this.name = name;
        this.group = group;
        this.StudentId = StudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return StudentId != null ? StudentId.equals(student.StudentId) : student.StudentId == null;
    }

    @Override
    public int hashCode() {
        return StudentId != null ? StudentId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nСтудент=" + " Имя:'" + name + '\'' + ", Группа:'" + group + '\'' + ", Студенческий номер: '" + StudentId + '\'';
    }

}
