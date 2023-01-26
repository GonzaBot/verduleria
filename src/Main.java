import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto leche= new Lacteo("leche",37,100,4);
        Producto manzana =new Fruta("manzana",22,1,"rojo");
        Producto jabon = new Limpieza("jabon",33,"gordura animal",0.5);
        Producto arroz= new Nperecedero("arroz",28,100,200);
        Producto yogurt= new Lacteo("yogurt",37,100,4);
        Producto pera =new Fruta("pera",22,1,"rojo");
        Producto desinfectante = new Limpieza("desinfectante",33,"gordura animal",0.5);
        Producto fideos= new Nperecedero("fideos",28,100,200);

        List<Producto> lista= new ArrayList<Producto>();
        lista.add(leche);
        lista.add(manzana);
        lista.add(jabon);
        lista.add(arroz);
        lista.add(yogurt);
        lista.add(pera);
        lista.add(desinfectante);
        lista.add(fideos);


        for (Producto p : lista) {
            System.out.println(p);
        }


    }
}