package domain;

import java.util.Objects;

public class Gafa {
    private String modelo;
    private String color;
    private int calibre;
    private float longitudVarilla;
    private float precio;

    public Gafa(String modelo, String color, int calibre, float longitudVarilla, float precio) {
        this.modelo = modelo;
        this.color = color;
        this.calibre = calibre;
        this.longitudVarilla = longitudVarilla;
        this.precio = precio;
    }

    public float getLongitudVarilla() {
        return longitudVarilla;
    }

    public void setLongitudVarilla(float longitudVarilla) {
        this.longitudVarilla = longitudVarilla;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Gafa{" +
                "longitudVarilla=" + longitudVarilla +
                ", calibre=" + calibre +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gafa gafa = (Gafa) o;
        return Float.compare(gafa.longitudVarilla, longitudVarilla) == 0 && calibre == gafa.calibre && Float.compare(gafa.precio, precio) == 0 && Objects.equals(modelo, gafa.modelo) && Objects.equals(color, gafa.color);
    }
}
