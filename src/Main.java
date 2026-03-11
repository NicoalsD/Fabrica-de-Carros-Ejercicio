public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema para crear carros");

        Planta planta1 = new Planta(15.5f, TipoLlanta.ALTO_DESEMPEÑO, 1200f, MaterialChasis.ACERO, Colores.VERDE);

        Planta planta2 = new Planta(16.0f, TipoLlanta.NIEVE, 1100f, MaterialChasis.ALUMINIO, Colores.ROJO);

        System.out.println("// 100 CARROS DE LA PLANTA 1");
        
        for (int i = 1; i <= 2; i++) {
            System.out.println("Carro n" + i + " " + planta1.fabricar());
        }      

        System.out.println("// 100 CARROS DE LA PLANTA 2");
        for (int i = 1; i <= 2; i++) {
                System.out.println("Carro n" + i + " " + planta2.fabricar());
        }      
    }
}