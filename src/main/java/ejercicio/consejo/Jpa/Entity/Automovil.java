package ejercicio.consejo.Jpa.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Columna I/N
    @Column(nullable = true)
    private String inColumn;

    @Column(nullable = true)
    private String marca;

    @Column(nullable = true)
    private String descripcion;

    @Column(nullable = true)
    private String tipo;

    // Años específicos
    @Column(nullable = true)
    private int anio2021;

    @Column(nullable = true)
    private int anio2020;

    @Column(nullable = true)
    private int anio2019;

    @Column(nullable = true)
    private int anio2018;

    @Column(nullable = true)
    private int anio2017;

    @Column(nullable = true)
    private int anio2016;

    @Column(nullable = true)
    private int anio2015;

    @Column(nullable = true)
    private int anio2014;

    @Column(nullable = true)
    private int anio2013;

    @Column(nullable = true)
    private int anio2012;

    // Constructores
    public Automovil() {
    }

    public Automovil(String inColumn, String marca, String descripcion, String tipo, int anio2021, int anio2020, int anio2019, int anio2018, int anio2017, int anio2016, int anio2015, int anio2014, int anio2013, int anio2012) {
        this.inColumn = inColumn;
        this.marca = marca;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.anio2021 = anio2021;
        this.anio2020 = anio2020;
        this.anio2019 = anio2019;
        this.anio2018 = anio2018;
        this.anio2017 = anio2017;
        this.anio2016 = anio2016;
        this.anio2015 = anio2015;
        this.anio2014 = anio2014;
        this.anio2013 = anio2013;
        this.anio2012 = anio2012;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInColumn() {
        return inColumn;
    }

    public void setInColumn(String inColumn) {
        this.inColumn = inColumn;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio2021() {
        return anio2021;
    }

    public void setAnio2021(int anio2021) {
        this.anio2021 = anio2021;
    }

    public int getAnio2020() {
        return anio2020;
    }

    public void setAnio2020(int anio2020) {
        this.anio2020 = anio2020;
    }

    public int getAnio2019() {
        return anio2019;
    }

    public void setAnio2019(int anio2019) {
        this.anio2019 = anio2019;
    }

    public int getAnio2018() {
        return anio2018;
    }

    public void setAnio2018(int anio2018) {
        this.anio2018 = anio2018;
    }

    public int getAnio2017() {
        return anio2017;
    }

    public void setAnio2017(int anio2017) {
        this.anio2017 = anio2017;
    }

    public int getAnio2016() {
        return anio2016;
    }

    public void setAnio2016(int anio2016) {
        this.anio2016 = anio2016;
    }

    public int getAnio2015() {
        return anio2015;
    }

    public void setAnio2015(int anio2015) {
        this.anio2015 = anio2015;
    }

    public int getAnio2014() {
        return anio2014;
    }

    public void setAnio2014(int anio2014) {
        this.anio2014 = anio2014;
    }

    public int getAnio2013() {
        return anio2013;
    }

    public void setAnio2013(int anio2013) {
        this.anio2013 = anio2013;
    }

    public int getAnio2012() {
        return anio2012;
    }

    public void setAnio2012(int anio2012) {
        this.anio2012 = anio2012;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", inColumn='" + inColumn + '\'' +
                ", marca='" + marca + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anio2021=" + anio2021 +
                ", anio2020=" + anio2020 +
                ", anio2019=" + anio2019 +
                ", anio2018=" + anio2018 +
                ", anio2017=" + anio2017 +
                ", anio2016=" + anio2016 +
                ", anio2015=" + anio2015 +
                ", anio2014=" + anio2014 +
                ", anio2013=" + anio2013 +
                ", anio2012=" + anio2012 +
                '}';
    }
}