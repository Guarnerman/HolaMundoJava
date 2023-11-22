public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Redondea hacia arriba
        System.out.println(Math.ceil(x));

        //Redondea hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un npumero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raíz
        System.out.println(Math.sqrt(y));

        //Area de un círculo
        System.out.println(Math.PI * Math.pow(y,2));
    }
}
