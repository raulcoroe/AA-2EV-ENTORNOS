package domain;

import java.util.Objects;

public class Optico {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private float salario;
    private Gafa gafaVendida;

    public Optico(String nombre, String apellido, int edad, String dni, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.salario = salario;
    }

    public Gafa verGafaVendida() {
        return gafaVendida;
    }

    public void venderGafa(Gafa gafa) {
        this.gafaVendida = gafa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Optico optico = (Optico) o;
        return edad == optico.edad && Float.compare(optico.salario, salario) == 0 && Objects.equals(nombre, optico.nombre) && Objects.equals(apellido, optico.apellido) && Objects.equals(dni, optico.dni) && Objects.equals(gafaVendida, optico.gafaVendida);
    }
}
