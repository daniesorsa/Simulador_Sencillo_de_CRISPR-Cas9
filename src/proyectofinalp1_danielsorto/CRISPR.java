package proyectofinalp1_danielsorto;
public class CRISPR {
    public static char complementoDeAdn(char base) {
        // Usamos switch para la lógica de decisión clara
        switch (Character.toUpperCase(base)) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                return 'X'; // Retorna un indicador de error si no es A, T, C, o G
        }
    }
    // metodos
    //metodo donde recibe secuenciaActual y posicion y hace el corte
}
