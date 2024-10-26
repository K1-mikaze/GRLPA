package PICUR_GRLPA.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Table(name = "acciones_preventivas")
@Entity(name = "acciones_preventivas")
public class Accion {

    @Id
    @SequenceGenerator(name = "acciones_sequence", sequenceName = "acciones_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "acciones_sequence")
    @Column(name = "id_accion", updatable = false)
    private Long id_accion;

    @OneToOne
    @JoinColumn(name = "id_evaluacion",nullable = false)
    private Evaluacion id_evaluacion;

    @Column(name = "descripcion", columnDefinition = "TEXT", nullable = false)
    private String descripcion;

    @Column(name = "fecha_implementacion", columnDefinition = "TIMESTAMP", nullable = false, updatable = false)
    private LocalDateTime fecha_implementacion;

    @Column( name = "responsable", columnDefinition = "VARCHAR(100)",nullable = false)
    private String responsable;

    @Column(name = "estado",columnDefinition = "VARCHAR(20)",nullable = false)
    private String estado;

    public Accion(Evaluacion id_evaluacion, String descripcion, LocalDateTime fecha_implementacion, String responsable, String estado) {
        this.id_evaluacion = id_evaluacion;
        this.descripcion = descripcion;
        this.fecha_implementacion = fecha_implementacion;
        this.responsable = responsable;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha_implementacion() {
        return fecha_implementacion;
    }

    public void setFecha_implementacion(LocalDateTime fecha_implementacion) {
        this.fecha_implementacion = fecha_implementacion;
    }

    public Long getId_accion() {
        return id_accion;
    }

    public void setId_accion(Long id_accion) {
        this.id_accion = id_accion;
    }

    public Evaluacion getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(Evaluacion id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
