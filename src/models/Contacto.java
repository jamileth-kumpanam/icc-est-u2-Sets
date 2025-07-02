package models;

public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
    }

    @Override
    public int compareTo(Contacto o) {
        int comparacionNombre = this.nombre.compareTo(o.nombre);
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        int comparacionApellido = this.apellido.compareTo(o.apellido);
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        return this.telefono.compareTo(o.telefono);
    }
}
