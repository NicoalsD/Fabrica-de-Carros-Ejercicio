import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema para crear carros");

        ArrayList<String> coloresPlanta1 = new ArrayList<>(Arrays.asList("VERDE", "AZUL", "BLANCO"));
        Planta planta1 = new Planta(15.5f, TipoLlanta.ALTO_DESEMPEÑO, 1200f, MaterialChasis.ACERO, coloresPlanta1);

        ArrayList<String> coloresPlanta2 = new ArrayList<>(Arrays.asList("ROJO", "NEGRO", "AMARILLO"));
        Planta planta2 = new Planta(16.0f, TipoLlanta.NIEVE, 1100f, MaterialChasis.ALUMINIO, coloresPlanta2);

        System.out.println("// 100 CARROS DE LA PLANTA 1");
        
        for (int i = 1; i <= 100; i++) {
            System.out.println("Carro n" + i + " " + planta1.fabricar("VERDE"));
        }      

        System.out.println("// 100 CARROS DE LA PLANTA 2");
        for (int i = 1; i <= 100; i++) {
            System.out.println("Carro n" + i + " " + planta2.fabricar("ROJO"));
        }      
    }
}