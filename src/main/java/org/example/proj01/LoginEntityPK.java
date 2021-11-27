package org.example.proj01;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class LoginEntityPK implements Serializable {
    private int idlogin;
    private String usr;
    private String pass;

    @Column(name = "idlogin", nullable = false)
    @Id
    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    @Column(name = "usr", nullable = false, length = 45)
    @Id
    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    @Column(name = "pass", nullable = false, length = 45)
    @Id
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
        LoginEntityPK that = (LoginEntityPK) o;
        return idlogin == that.idlogin && Objects.equals(usr, that.usr) && Objects.equals(pass, that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlogin, usr, pass);
    }
}
