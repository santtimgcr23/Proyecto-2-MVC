package Objetos;

import java.util.ArrayList;
import java.util.List;

public class HambVandal extends Hamburguesa {

    public HambVandal() {
        super("La Vandal",
                new ArrayList<String>(List.of("Lechuga", "Lechuga", "Torta", "Queso", "Cebolla", "Pepinillos")), 4000);
    }

}
