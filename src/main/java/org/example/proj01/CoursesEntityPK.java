package org.example.proj01;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CoursesEntityPK implements Serializable {
    private int idcourse;
    private String coursename;
    private String coursepage;

    @Column(name = "idcourse", nullable = false)
    @Id
    public int getIdcourse() {
        return idcourse;
    }

    public void setIdcourse(int idcourse) {
        this.idcourse = idcourse;
    }

    @Column(name = "coursename", nullable = false, length = 45)
    @Id
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Column(name = "coursepage", nullable = false, length = 45)
    @Id
    public String getCoursepage() {
        return coursepage;
    }

    public void setCoursepage(String coursepage) {
        this.coursepage = coursepage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesEntityPK that = (CoursesEntityPK) o;
        return idcourse == that.idcourse && Objects.equals(coursename, that.coursename) && Objects.equals(coursepage, that.coursepage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcourse, coursename, coursepage);
    }
}
