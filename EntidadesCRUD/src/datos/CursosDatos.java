package datos;

import entidades.Cursos;
import java.util.ArrayList;
import java.util.List;

public class CursosDatos {
    
    public static List<Cursos> ListaAlumnos = new ArrayList<Cursos>();
    static int id=0;
    
    public CursosDatos(){
    }
    
    public void create(Cursos d){
        id = id + 1;
        System.out.println("ID: " + id);
        d.setId(id);
        ListaAlumnos.add(d);
    }
    
    public void delete(int id) {
        for (Cursos d : ListaAlumnos){
            if (id == d.getId()){
                ListaAlumnos.remove(d);
                System.out.println("Eliminado " + d.getNombre());
            }
        }
    }
        
}
