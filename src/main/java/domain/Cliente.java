package domain;


import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private float presuspuesto;

    public Cliente(String nombre, String apellido, int edad, String dni, float presuspuesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.presuspuesto = presuspuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getPresuspuesto() {
        return presuspuesto;
    }

    public void setPresuspuesto(float presuspuesto) {
        this.presuspuesto = presuspuesto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", presuspuesto=" + presuspuesto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (edad != cliente.edad) return false;
        if (Float.compare(cliente.presuspuesto, presuspuesto) != 0) return false;
        if (!Objects.equals(nombre, cliente.nombre)) return false;
        if (!Objects.equals(apellido, cliente.apellido)) return false;
        return Objects.equals(dni, cliente.dni);
    }

}
