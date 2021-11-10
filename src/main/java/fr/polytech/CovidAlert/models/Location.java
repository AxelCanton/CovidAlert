package fr.polytech.CovidAlert.models;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="locations")
@Access(AccessType.FIELD)
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long location_id;

    private Double latitude;
    private Double longitude;
    private Date location_date;


    @ManyToMany(mappedBy = "locations")
    @JsonIgnore // Pour ne pas produire des cycles
    private List<User> users;

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Date getLocation_date() {
        return location_date;
    }

    public void setLocation_date(Date location_date) {
        this.location_date = location_date;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
