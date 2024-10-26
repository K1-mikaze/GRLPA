package PICUR_GRLPA.Model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "mediciones")
@Table(name = "mediciones")
public class Medicion {

    @Id
    @SequenceGenerator(name = "medicion_sequence", sequenceName = "medicion_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "medicion_sequence")
    @Column(name = "id_medicion", updatable = false)
    private Long id_medicion;

    @OneToOne
    @JoinColumn(name = "id_sensor",nullable = false)
    private Sensor id_sensor;

    @Column(name = "fecha_hora", columnDefinition = "TIMESTAMP", nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime fecha_hora;//Formato 2007-10-1T11:10:30 YY-MM-DD T HH:MM:SS
    @Column(name = "valor_ph", columnDefinition = "double", nullable = false)
    private double valor_ph;

    @Column(name = "volumen", columnDefinition = "double", nullable = false)
    private double volumen;

    @Column(name = "temperatura",columnDefinition = "double",nullable = false)
    private double temperatura;

    public Medicion(LocalDateTime fecha_hora, Sensor id_sensor, double temperatura, double valor_ph, double volumen) {
        this.fecha_hora = fecha_hora;
        this.id_sensor = id_sensor;
        this.temperatura = temperatura;
        this.valor_ph = valor_ph;
        this.volumen = volumen;
    }

    public Long getId_medicion() {
        return id_medicion;
    }

    public void setId_medicion(Long id_medicion) {
        this.id_medicion = id_medicion;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setDate(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Sensor getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(Sensor id_sensor) {
        this.id_sensor = id_sensor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getValor_ph() {
        return valor_ph;
    }

    public void setValor_ph(double valor_ph) {
        this.valor_ph = valor_ph;
    }
}
