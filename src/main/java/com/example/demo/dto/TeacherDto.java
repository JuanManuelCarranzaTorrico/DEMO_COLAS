package com.example.demo.dto;
import com.example.demo.entity.Teacher;
/**
 * @author IKKI_CARRANZA
 */
public class TeacherDto {
    private int teacher_id;
    private String name;
    private String email;
    private String phone;
    public TeacherDto(){
    }
    public TeacherDto(Teacher teacher){
        teacher_id= teacher.getTeacherId();
        name=teacher.getName();
        email=teacher.getEmail();
        phone=teacher.getPhone();
    }
    public TeacherDto(int teacher_id, String name, String email, String phone){
        this.teacher_id=teacher_id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "TeacherDto{" +
                "teacher_id=" + teacher_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
