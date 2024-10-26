package PICUR_GRLPA.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "sensores")
@Table(name = "sensores")
public class Sensor {

    @Id
    @SequenceGenerator(
            name = "sensores_sequence",
            sequenceName = "sensores_sequence"
    )@GeneratedValue(strategy = SEQUENCE,generator = "sensores_sequence"
    )
    @Column(
            name = "id_sensor",
            updatable = false
    )
    private Long id_sensor;


    @Column(
            name = "tipo",
            columnDefinition = "VARCHAR(50)",
            nullable = false
    )
    private String tipo;

    @Column(
            name = "ubicacion",
            columnDefinition = "VARCHAR(100)",
            nullable = false
    )
    private String ubicacion;

    @Column(
            name = "fecha_instalacion",
            columnDefinition = "TIMESTAMP",
            nullable = false
    )
    private LocalDateTime fecha_instalacion; //Formato 2007-10-1T11:10:30 YY-MM-DD T HH:MM:SS

    public Sensor(String ubicacion, String tipo, LocalDateTime fecha_instalacion) {
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.fecha_instalacion = fecha_instalacion;
    }

    public Long getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(Long id_sensor) {
        this.id_sensor = id_sensor;
    }

    public LocalDateTime getFecha_instalacion() {
        return fecha_instalacion;
    }

    public void setFecha_instalacion(LocalDateTime fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
