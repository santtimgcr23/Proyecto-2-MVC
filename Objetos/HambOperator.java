package Objetos;

import java.util.ArrayList;
import java.util.List;

public class HambOperator extends Hamburguesa {

    public HambOperator() {
        super("La Operator",
                new ArrayList<String>(List.of("Pan especial", "Triple torta", "Triple Queso", "Pepinillos")), 4700);
    }

}
