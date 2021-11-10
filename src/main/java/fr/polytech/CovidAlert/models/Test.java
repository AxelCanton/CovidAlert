package fr.polytech.CovidAlert.models;

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

    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User user;

    public long getId_test() {
        return id_test;
    }

    public void setId_test(long id_test) {
        this.id_test = id_test;
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
