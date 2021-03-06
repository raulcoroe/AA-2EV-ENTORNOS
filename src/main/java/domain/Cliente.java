package domain;


import java.util.Objects;

public class Cliente extends Persona {
    private float presuspuesto;
    private Gafa gafaComprada;

    public Cliente(String nombre, String apellido, int edad, String dni, float presuspuesto) {
        super(nombre, apellido, edad, dni);
        this.presuspuesto = presuspuesto;
    }

    public Gafa verGafaComprada() {
        return gafaComprada;
    }

    public void comprarGafa(Gafa gafaComprada) {
        this.gafaComprada = gafaComprada;
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
