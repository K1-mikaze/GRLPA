package PICUR_GRLPA.Model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Table(name = "impacto_ambiental")
@Entity(name = "impacto_ambiental")
public class Impacto {

    @Id
    @SequenceGenerator(
            name = "impacto_sequence",
            sequenceName = "impacto_sequence"
    )@GeneratedValue(strategy = SEQUENCE,generator = "impacto_sequence"
    )
    @Column(
            name = "id_impacto",
            updatable = false
    )
    private Long id_impacto;

    @OneToOne
    @JoinColumn(name = "id_evaluacion", nullable = false)
    private Evaluacion id_evaluacion;

    @Column(name = "tipo_impacto", columnDefinition = "VARCHAR(50)", nullable = false)
    private String tipo_impacto;

    @Column( name = "descripcion", columnDefinition = "TEXT",nullable = false)
    private String descripcion;

    @Column( name = "severidad", columnDefinition = "VARCHAR(20)", nullable = false)
    private String severidad;

    public Impacto(Evaluacion id_evaluacion, String tipo_impacto, String descripcion, String severidad) {
        this.id_evaluacion = id_evaluacion;
        this.tipo_impacto = tipo_impacto;
        this.descripcion = descripcion;
        this.severidad = severidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId_impacto() {
        return id_impacto;
    }

    public void setId_impacto(Long id_impacto) {
        this.id_impacto = id_impacto;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getTipo_impacto() {
        return tipo_impacto;
    }

    public void setTipo_impacto(String tipo_impacto) {
        this.tipo_impacto = tipo_impacto;
    }

    public Evaluacion getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(Evaluacion id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }
}
