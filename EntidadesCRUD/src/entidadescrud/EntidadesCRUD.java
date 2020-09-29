package entidadescrud;

import java.util.List;
import java.util.Scanner;
import datos.AlumnosDatos;
import entidades.Alumnos;

public class EntidadesCRUD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt = 0;
        AlumnosDatos pData = new AlumnosDatos();
        do {
            System.out.println("***** CRUD PERSONA *****");
            System.out.println("1 Listar ");
            System.out.println("2 Nuevo ");
            System.out.println("3 Eliminar ");
            System.out.println("0 Salir ");
            System.out.println("Seleccionar: ");
            opt = input.nextInt();
            System.out.println("Tu seleccionaste: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 Listar *****");
                    List<Alumnos> lis = pData.ListaAlumnos;
                    System.out.println("ID \t Nombre \t Sexo");
                    for (Alumnos d : lis) {
                        System.out.println(d.getId() + "\t" + d.getNombre()+ "\t" + d.getFechaNac()+ "\t" + d.getDireccion()+ "\t" + d.getCorreo()+ "\t" + d.getDni());
                    }
                    break;
                case 2:
                    System.out.println("**** 2 Nuevo ****");
                    Alumnos d = new Alumnos();

                    System.out.print("Ingrese Nombre: ");
                    d.setNombre(input.nextLine());
                    System.out.print("Ingrese Apellido Paterno: ");
                    d.setAPpaterno(input.nextLine());
                    System.out.print("Ingrese Apellido Materno: ");
                    d.setAPmaterno(input.nextLine());

                    pData.create(d);
                    break;
                case 3:
                    System.out.println("**** 3 Eliminar ****");
                    System.out.print("Ingrese ID a eliminar: ");
                    pData.delete(input.nextInt());
                    input.nextLine();
                    break;

                case 9:
                    System.out.println("Salir ");
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
        } while (opt != 0);

    }
}