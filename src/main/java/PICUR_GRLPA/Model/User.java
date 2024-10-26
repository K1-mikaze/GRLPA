package PICUR_GRLPA.Model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "usuarios")
@Table(name = "usuarios",
uniqueConstraints = {
        @UniqueConstraint(name = "usuario_email_unique", columnNames = "email")
})
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = SEQUENCE,generator = "User_sequence"
    )
    @Column(
            name = "id_usuario",
            updatable = false
    )
    private Long id_usuario;

    @Column(name = "nombre",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String name;

    @Column(name = "apellido",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String surname;

    @Column(name = "email",
           nullable = false,
            columnDefinition = "VARCHAR(320)"

    )
    private String email;

    @Column(name = "rol",
            nullable = false,
            columnDefinition = "VARCHAR(150)"
    )
    private String rol;

    @Column(name = "fecha_registro",
            columnDefinition = "TIMESTAMP",
            nullable = false,
            updatable = false
    )
    @CreatedDate
    private LocalDateTime date;//Formato 2007-10-1T11:10:30 YY-MM-DD T HH:MM:SS

    public User() {
    }

    public User( String name, String surname, String email, String rol,LocalDateTime date) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.rol = rol;
        this.date = date;
    }

    public Long getId() {
        return id_usuario;
    }

    public void setId(Long id_usuario) {
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
