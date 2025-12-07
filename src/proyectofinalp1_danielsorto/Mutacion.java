package proyectofinalp1_danielsorto;

import java.util.ArrayList;

public class Mutacion {
    String nombre;
    String descripcion;
    ArrayList<String> secuenciaActual = new ArrayList<>();
    ArrayList<String> secuenciaCorrecta = new ArrayList<>();
    int posMutacion;

    //constructores

    public Mutacion(String nombre, String descripcion, int posMutacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.posMutacion = posMutacion;
    }
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<String> getSecuenciaActual() {
        return secuenciaActual;
    }

    public ArrayList<String> getSecuenciaCorrecta() {
        return secuenciaCorrecta;
    }

    public int getPosMutacion() {
        return posMutacion;
    }
    
    
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSecuenciaActual(ArrayList<String> secuenciaActual) {
        this.secuenciaActual = secuenciaActual;
    }

    public void setSecuenciaCorrecta(ArrayList<String> secuenciaCorrecta) {
        this.secuenciaCorrecta = secuenciaCorrecta;
    }

    public void setPosMutacion(int posMutacion) {
        this.posMutacion = posMutacion;
    }
    
    
    //metodos
    
    
        //toString
    @Override
    public String toString() {
        return "Nombre de la Mutación: " + nombre + "\nDescripcion: " + descripcion + "\nSecuenciaActual: " + secuenciaActual;
    }
    
    // metodo para verificar corte
        // si es correcto solo se hace y copia en secuencia correcta, si no se explica y se corrige
    
}
