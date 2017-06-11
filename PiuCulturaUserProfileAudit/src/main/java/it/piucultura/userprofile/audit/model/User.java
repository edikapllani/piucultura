package it.piucultura.userprofile.audit.model;

/**
 * Created by earthshrek on 06/06/2017.
 */
import java.util.Date;

public class User {
    private long id;
    private String name;
    private String subject;


    public User() {
    }

    public User(String name, String subject) {
        this.id = (new Date()).getTime();
        this.name = name;
        this.subject = subject;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
