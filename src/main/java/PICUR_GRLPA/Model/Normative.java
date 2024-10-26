package PICUR_GRLPA.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "normativas")
@Table(name = "normativas")
public class Normative {

    @Id
    @SequenceGenerator(
            name = "normative_sequence",
            sequenceName = "normative_sequence"
    )@GeneratedValue(strategy = SEQUENCE,generator = "normative_sequence"
    )
    @Column(
            name = "id_usuario",
            updatable = false
    )
    private Long id;
    @Column(
            name = "nombre",
            columnDefinition = "VARCHAR(100)",
            nullable = false
    )
    private String activity_name;
    @Column(
            name = "descripcion",
            columnDefinition = "TEXT",
           nullable = false
    )
    private String description;
    @Column(
            name = "fecha_vigencia",
            columnDefinition = "TIMESTAMP",
            nullable = false
    )
    private LocalDateTime validity;//Formato 2007-10-1T11:10:30 YY-MM-DD T HH:MM:SS

    public Normative(String activity_name,String description,LocalDateTime validity){
        this.activity_name = activity_name;
        this.description = description;
        this.validity=validity;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getValidity() {
        return validity;
    }

    public void setValidity(LocalDateTime validity) {
        this.validity = validity;
    }
}
