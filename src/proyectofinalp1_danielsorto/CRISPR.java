package proyectofinalp1_danielsorto;
public class CRISPR {
    public static char complementoDeAdn(char base) {
        switch (Character.toUpperCase(base)) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
            default: return 'X'; // retorna "error" si no es A, T, C, o G
        }
    }
    public static int contarBaseRecursivo(char[] secuencia, char baseBuscada, int indice) {
        // indice empieza en la ultima pos
        if (indice < 0) return 0;
        
        int match = (Character.toUpperCase(secuencia[indice]) == Character.toUpperCase(baseBuscada)) ? 1 : 0;
        return match + contarBaseRecursivo(secuencia, baseBuscada, indice - 1);
    }
}
