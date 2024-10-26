package PICUR_GRLPA.Model;

import PICUR_GRLPA.Controller.EducationController;
import jakarta.persistence.*;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "educacion_concientizacion")
@Table(name = "educacion_concientizacion")
public class Education {
    @Id
    @SequenceGenerator(
            name = "education_sequence",
            sequenceName = "education_sequence"
    )@GeneratedValue(strategy = SEQUENCE,generator = "education_sequence"
    )
    @Column(
            name = "id_actividad",
            updatable = false
    )
    private Long id;
    @Column(
            name = "tipo_actividad",
            columnDefinition = "VARCHAR(50)",
            nullable = false
    )
    private String activity_type;
    @Column(
            name = "fecha",
            columnDefinition = "TIMESTAMP",
            nullable = false,
            updatable = false
    )
    private LocalDateTime date;//Formato 2007-10-1T11:10:30 YY-MM-DD T HH:MM:SS
    @Column(
            name = "descripcion",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String description;

    public Education(String activity_type, LocalDateTime date, String description){
        this.activity_type = activity_type;
        this.date = date;
        this.description = description;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(String activity_type) {
        this.activity_type = activity_type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
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
}
