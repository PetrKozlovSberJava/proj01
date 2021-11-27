package org.example.proj01;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DepartmentsEntityPK implements Serializable {
    private int iddepartments;
    private String departmentscol;

    @Column(name = "iddepartments", nullable = false)
    @Id
    public int getIddepartments() {
        return iddepartments;
    }

    public void setIddepartments(int iddepartments) {
        this.iddepartments = iddepartments;
    }

    @Column(name = "departmentscol", nullable = false, length = 45)
    @Id
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
        DepartmentsEntityPK that = (DepartmentsEntityPK) o;
        return iddepartments == that.iddepartments && Objects.equals(departmentscol, that.departmentscol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddepartments, departmentscol);
    }
}
