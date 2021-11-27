package org.example.proj01;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "departments", schema = "db", catalog = "")
@IdClass(DepartmentsEntityPK.class)
public class DepartmentsEntity {
    private int iddepartments;
    private String departmentscol;

    @Id
    @Column(name = "iddepartments", nullable = false)
    public int getIddepartments() {
        return iddepartments;
    }

    public void setIddepartments(int iddepartments) {
        this.iddepartments = iddepartments;
    }

    @Id
    @Column(name = "departmentscol", nullable = false, length = 45)
    public String getDepartmentscol() {
        return departmentscol;
    }

    public void setDepartmentscol(String departmentscol) {
        this.departmentscol = departmentscol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentsEntity that = (DepartmentsEntity) o;
        return iddepartments == that.iddepartments && Objects.equals(departmentscol, that.departmentscol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddepartments, departmentscol);
    }
}
