package proyectofinalp1_danielsorto;
public class Mutacion {
    private String nombre;
    private String descripcion;
    private char[] secuenciaMutada = null; //secuencia con una linea incorrecta, la segunda parte o la pareja de cada letra se llena automatico segun esta
    private char[] secuenciaCorrecta = null;
    private int posMutacion;

     //constructores

    public Mutacion(String nombre, String descripcion, char[] adnMutado, char[] adnCorrecto, int posMutacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.secuenciaMutada = adnMutado;
        this.secuenciaCorrecta = adnCorrecto;
        this.posMutacion = posMutacion;
     }

     //getters

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public char[] getSecuenciaMutada() {
        return secuenciaMutada;
    }

    public char[] getSecuenciaCorrecta() {
        return secuenciaCorrecta;
    }

    public int getPosMutacion() {
        return posMutacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSecuenciaMutada(char[] secuenciaMutada) {
        this.secuenciaMutada = secuenciaMutada;
    }

    public void setSecuenciaCorrecta(char[] secuenciaCorrecta) {
        this.secuenciaCorrecta = secuenciaCorrecta;
    }

    public void setPosMutacion(int posMutacion) {
        this.posMutacion = posMutacion;
    }



     //metodos


        //toString
    //toString
     @Override
     public String toString() {
        return "Nombre de la Mutación: " + nombre + "\nDescripcion: " + descripcion;// + "\nSecuenciaMutada: " + secuenciaMutada;
     }

    // metodo para verificar corte
        // si es correcto solo se hace y copia en secuencia correcta, si no se explica y se corrige
}