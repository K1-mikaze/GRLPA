package PICUR_GRLPA.Model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Table(name =  "evaluacion_riesgo")
@Entity(name = "evalucion_riesgo")
public class Evaluacion {

    @Id
    @SequenceGenerator(name = "evaluacion_sequence", sequenceName = "evaluacion_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "evaluacion_sequence")
    @Column(name = "id_evaluacion", updatable = false)
    private Long id_evaluacion;

    @OneToOne
    @JoinColumn(name = "id_medicion", nullable = false)
    private Medicion id_medicion;

    @Column(name = "nivel_riesgo",columnDefinition = "VARCHAR(20)", nullable = false)
    private  String nivel_riesgo;

    @Column( name = "porcentaje_riesgo", columnDefinition = "Double", unique = false)
    private double porcentaje_riesgo;

    @Column( name = "descripcion", columnDefinition = "TEXT",nullable = false)
    private String descripcion;

    public Evaluacion(Medicion id_medicion,String nivel_riesgo, double porcentaje_riesgo,String descripcion) {
        this.descripcion = descripcion;
        this.id_medicion = id_medicion;
        this.nivel_riesgo = nivel_riesgo;
        this.porcentaje_riesgo = porcentaje_riesgo;
    }

    public Long getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(Long id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public Medicion getId_medicion() {
        return id_medicion;
    }

    public void setId_medicion(Medicion id_medicion) {
        this.id_medicion = id_medicion;
    }

    public double getPorcentaje_riesgo() {
        return porcentaje_riesgo;
    }

    public void setPorcentaje_riesgo(double porcentaje_riesgo) {
        this.porcentaje_riesgo = porcentaje_riesgo;
    }

    public String getNivel_riesgo() {
        return nivel_riesgo;
    }

    public void setNivel_riesgo(String nivel_riesgo) {
        this.nivel_riesgo = nivel_riesgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
