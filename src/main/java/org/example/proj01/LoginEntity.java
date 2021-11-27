package org.example.proj01;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "login", schema = "db", catalog = "")
@IdClass(LoginEntityPK.class)
public class LoginEntity {
    private int idlogin;
    private String usr;
    private String pass;

    @Id
    @Column(name = "idlogin", nullable = false)
    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    @Id
    @Column(name = "usr", nullable = false, length = 45)
    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    @Id
    @Column(name = "pass", nullable = false, length = 45)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginEntity that = (LoginEntity) o;
        return idlogin == that.idlogin && Objects.equals(usr, that.usr) && Objects.equals(pass, that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlogin, usr, pass);
    }
}
