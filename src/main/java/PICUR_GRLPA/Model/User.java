package PICUR_GRLPA.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "Usuarios") //CHANGE LIBRARY
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "rol")
    private String rol;

    @Column(name = "fecha_registro")
    @CreatedDate
    private LocalDateTime date;

    public User() {
    }

    public User(int id_usuario, String name, String surname, String email, String rol, LocalDateTime date) {
        this.id_usuario = id_usuario;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.rol = rol;
        this.date = date;
    }

    public int getId() {
        return id_usuario;
    }

    public void setId(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
