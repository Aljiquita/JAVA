
package reto1_ciclo2;


public class BecaUniversitaria {
    public static void main(String[] args) {
        /*
        Caso 1:
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
        */
        
        // Caso 2:
        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48,10000,2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());
        
        
        /*
        Caso 3:
        BecaUniversitaria becaUniversitaria2b = new BecaUniversitaria();
        System.out.println(becaUniversitaria2b.calcularInteresSimple());
        System.out.println(becaUniversitaria2b.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2b.compararInversion());
        */
    }

    public int pTiempo;
    public int pMonto;
    public double pInteres;

    public BecaUniversitaria() {
        this.pTiempo = 0;
        this.pMonto = 0;
        this.pInteres = 0;
    }
    
    public BecaUniversitaria(int pTiempo, int pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }

    public  String compararInversion(int pTiempo , int pMonto , double pInteres ) {
        double InteresCompuesto = Math.round((pMonto * (Math.pow(1+ (pInteres/100), pTiempo) - 1)));
        double InteresSimple = Math.round(pMonto * (pInteres/100) * pTiempo)  ; 
        double diferencia = InteresCompuesto - InteresSimple;
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;
     }
     
    
    public  double calcularInteresSimple() {
        double InteresSimple = Math.round(pMonto * (pInteres/100) * pTiempo)  ; 
        return InteresSimple;
    }

    public  double calcularInteresCompuesto() {
        double InteresCompuesto = Math.round((pMonto * (Math.pow(1+ (pInteres/100), pTiempo) - 1)));
        return InteresCompuesto;
    }

    public String compararInversion() {
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia > 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
    
}
