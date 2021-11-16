package fr.polytech.CovidAlert.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity(name="tests")
@Access(AccessType.FIELD)
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_test;

    private Date date;
    private String nom;
    private boolean is_negative;

    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    @JsonIgnore
    private User user;

    public long getId_test() {
        return id_test;
    }

    public void setId_test(long id_test) {
        this.id_test = id_test;
    }

    public boolean isIs_negative() {
        return is_negative;
    }

    public void setIs_negative(boolean is_negative) {
        this.is_negative = is_negative;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
