import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    private Map<Integer, String> ubicaciones = new HashMap<>();

    public Main(Map<Integer, String> ubicaciones) {
        Ubicacion clase  = new Ubicacion(0, "Estás sentado en la clase de programación");
        ubicaciones.put(clase.getId(),clase.getDescripcion());
        Ubicacion montanya = new Ubicacion(1, "Estás en la cima de una montaña");
        ubicaciones.put(montanya.getId(),montanya.getDescripcion());
        Ubicacion playa = new Ubicacion(2, "Estás bañandote en la playa");
        ubicaciones.put(playa.getId(),playa.getDescripcion());
        Ubicacion edificio = new Ubicacion(3, "Estás dentro de un edificio muy alto");
        ubicaciones.put(edificio.getId(),edificio.getDescripcion());
        Ubicacion puente = new Ubicacion(4, "Estás de pie en un puente");
        ubicaciones.put(puente.getId(),puente.getDescripcion());
        Ubicacion bosque = new Ubicacion(5, "Estás en un bosque");
        ubicaciones.put(bosque.getId(),bosque.getDescripcion());
        montanya.addExist("N", 5);
        montanya.addExist("S", 4);
        montanya.addExist("E", 3);
        montanya.addExist("O", 2);
        montanya.addExist("Q", 0);
        playa.addExist("N", 5);
        playa.addExist("Q", 0);
        edificio.addExist("E", 1);
        edificio.addExist("Q", 0);
        puente.addExist("N", 1);
        puente.addExist("O", 2);
        puente.addExist("Q", 0);
        bosque.addExist("S", 1);
        bosque.addExist("O", 2);
        bosque.addExist("Q", 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
    }
}
