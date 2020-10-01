package entidades;

import java.util.Date;

public class Alumnos {
    
    private int id;
    private String nombre;
    private String APpaterno;
    private String APmaterno;
    private int fechaNac;
    private String direccion;
    private String correo;
    private int dni;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAPpaterno() {
        return APpaterno;
    }

    public void setAPpaterno(String APpaterno) {
        this.APpaterno = APpaterno;
    }

    public String getAPmaterno() {
        return APmaterno;
    }

    public void setAPmaterno(String APmaterno) {
        this.APmaterno = APmaterno;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

   

    
}
