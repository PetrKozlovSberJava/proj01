package org.example.proj01;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "courses", schema = "db", catalog = "")
@IdClass(CoursesEntityPK.class)
public class CoursesEntity {
    private int idcourse;
    private String coursename;
    private String coursepage;

    @Id
    @Column(name = "idcourse", nullable = false)
    public int getIdcourse() {
        return idcourse;
    }

    public void setIdcourse(int idcourse) {
        this.idcourse = idcourse;
    }

    @Id
    @Column(name = "coursename", nullable = false, length = 45)
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Id
    @Column(name = "coursepage", nullable = false, length = 45)
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
        CoursesEntity that = (CoursesEntity) o;
        return idcourse == that.idcourse && Objects.equals(coursename, that.coursename) && Objects.equals(coursepage, that.coursepage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcourse, coursename, coursepage);
    }
}
