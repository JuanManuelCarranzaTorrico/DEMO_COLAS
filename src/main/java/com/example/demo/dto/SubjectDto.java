package com.example.demo.dto;
import com.example.demo.entity.Subject;
/**
 * @author IKKI_CARRANZA
 */
public class SubjectDto {
    private int subject_id;
    private int credits;
    private String name;
    private int semester;
    private int status;

    public SubjectDto() {
    }
    public SubjectDto(Subject subject){
        subject_id=subject.getSubjectId();
        credits=subject.getCredits();
        name=subject.getName();
        semester=subject.getSemester();
        status=subject.getStatus();
    }
    public SubjectDto(int subject_id,int credits,String name,int semester,int status){
        this.subject_id=subject_id;
        this.credits=credits;
        this.name=name;
        this.semester=semester;
        this.status=status;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "subject_id=" + subject_id +
                ", credits=" + credits +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                ", status=" + status +
                '}';
    }

}
