package datos;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.List;
import entidadescrud.EntidadesCRUD;

public class AlumnosDatos {
    
    public static List<Alumnos> ListaAlumnos = new ArrayList<Alumnos>();
    static int id=0;
    private String APpaterno;
    private String nombre;
    private String APmaterno;
    private int fechaNac;
    private String direccion;
    private String correo;
    private int dni;
    private Iterable<Alumnos> AlumnosDatos;
    
    public AlumnosDatos(){
    }
    
    public void create(Alumnos d) {
        id = id + 1;
        System.out.println("ID: " + id);
        d.setId(id);
        ListaAlumnos.add(d);
    }
    public void delete(int id) {
        for (Alumnos d : ListaAlumnos){
            if (id == d.getId()){
                ListaAlumnos.remove(d);
                System.out.println("Eliminado " + d.getNombre());
            }
        }
    }
    public void representante(int id, String nombre, String APpaterno, String APmaterno, int fechaNac, String direccion, String correo, int dni){
        this.id=id;
        this.nombre=nombre;
        this.APpaterno = APpaterno;
        this.APmaterno = APmaterno;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.correo = correo;
        this.dni = dni;
        
    }
    public void update(int id, String Nombre, String APpaterno, String APmaterno, int FechaNac, String Direccion, String Correo, int dni) {
        for (Alumnos Alumnos: AlumnosDatos) {
            if (Alumnos.getID() == id) {
                Alumnos d = new Alumnos();
                d.setNombre(Nombre);
                d.setAPpaterno(APpaterno);
                d.setAPmaterno(APmaterno);
                d.setFechaNac(FechaNac);
                d.setDireccion(Direccion);
                d.setCorreo(Correo);
                d.setDni(dni);
                System.out.print("Se Actualizo Correctamente");
            }
        }
    }
    
}
