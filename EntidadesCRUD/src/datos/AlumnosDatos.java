package datos;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.List;

public class AlumnosDatos {
    
    public static List<Alumnos> ListaAlumnos = new ArrayList<Alumnos>();
    static int id=0;
    
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
    
}
