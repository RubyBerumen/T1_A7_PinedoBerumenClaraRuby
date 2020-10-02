import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Alumno{
	private String nombre;
	private byte edad;
	private String carrera;
	private String fechaInscripcion;
	
	
	public Alumno() {}
	public Alumno(String nombre, byte edad, String carrera, String fechaInscripcion) {
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public byte getEdad() {return edad;}
	public void setEdad(byte edad) {this.edad = edad;}
	public String getCarrera() {return carrera;}
	public void setCarrera(String carrera) {this.carrera = carrera;}
	public String getFechaInscripcion() {return fechaInscripcion;}
	public void setFechaInscripcion(String fechaInscripcion) {this.fechaInscripcion = fechaInscripcion;}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", fechaInscripcion="
				+ fechaInscripcion + "]";
	}
	
}//class Alumno


class VerificarAlumnos{
	String nombre;
	byte edad;
	String carrera;
	String fecha;

	Map<Integer,Alumno> mapAlumnos = new HashMap<Integer,Alumno>();
	
	Alumno a1,a2,a3,a4,a5;
	
	public void crearObjeto() {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingresa el nombre: ");
		nombre = ent.nextLine();
		System.out.println("Ingresa la edad: ");
		edad = ent.nextByte();
		System.out.println("Ingresa la carrera: (IS,IIA,IM,LA,CP) ");
		carrera = ent.nextLine().toUpperCase();
		ent.next();
		System.out.println("Ingresa la fecha de inscripción: (dd/mm/aaaa)");
		fecha = ent.nextLine();
		ent.next();
	}
	
	public void llenarObjetos() {
		System.out.println("Alumno 1");
		crearObjeto();
		a1 = new Alumno(nombre,edad,carrera,fecha);
		System.out.println(a1.toString());
		
		System.out.println("Alumno 2");
		crearObjeto();
		a2 = new Alumno(nombre,edad,carrera,fecha);
		
		System.out.println("Alumno 3");
		a3 = new Alumno(nombre,edad,carrera,fecha);
	
		System.out.println("Alumno 4");
		crearObjeto();
		a4 = new Alumno(nombre,edad,carrera,fecha);

		System.out.println("Alumno 5");
		crearObjeto();
		a5 = new Alumno(nombre,edad,carrera,fecha);
		
	}
	
	
	public void llenarLista() {
		mapAlumnos.put(1, a1);
		mapAlumnos.put(2, a2);
		mapAlumnos.put(3, a3);
		mapAlumnos.put(4, a4);
		mapAlumnos.put(5, a5);
		System.out.println("La lista se ha llenado");
	}
	
	
	public void vaciarLista() {
		mapAlumnos.clear();
		System.out.println("La lista se ha vaciado");
	}
	
	
	public void mostrarPorCarreras(String carrera) {
		for(int i = 0; i<mapAlumnos.size(); i++) {
			Alumno a = mapAlumnos.get(i);
			if (a.getCarrera().contains("ISC")) {
				System.out.println(a);
			}
		}
		
	}
	
	public byte promeidoEdades() {
		
		
		
		return(byte)0;
	}
	
	
	
}//class VerificarAlumnos

public class AlumnosHashMap {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		VerificarAlumnos va = new VerificarAlumnos();
		boolean salir = false;
		
		do {
			System.out.println("1) Llenar lista");
			System.out.println("2) Vaciar lista");
			System.out.println("3) Mostrar los alumnos por carrera");
			System.out.println("4) Calcular Promedio de edades");
			System.out.println("5) ");
			System.out.println("6) Salir");
			
			try {
				System.out.println("Elige una opción:");
                int op = ent.nextInt();
                
                switch (op) {
                	case 1 :
                		va.llenarLista();
                		break;
                		
                	case 2 :
                		va.vaciarLista();
                		break;
                		
                	case 3 : 
                		System.out.println("Ingresa la carrera: (IS,IIA,IM,LA,CP) ");
                		String carrera = ent.nextLine().toUpperCase();
                		va.mostrarPorCarreras(carrera);
                		
                	
                	default:
                        System.out.println("Debes ingresar números entre 1 y 6");
               
                }
				
				
			} catch (InputMismatchException e) {
				System.out.println("Debes ingresar un número");
                ent.next();
			}
			 
			    
			    
			       
			
		} while (!salir);
		
		
		
		
		
		
		
		
		

	}

}
