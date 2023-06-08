package Objetos;

import java.io.Serializable;

public class HambFactory implements Serializable {

    public static Hamburguesa cocinarHamburguesa(String name) {
        switch (name) {
            case ("La Classic"):
                return new HambClassic();
            case ("La Spectre"):
                return new HambSpectre();
            case ("La Vandal"):
                return new HambVandal();
            case ("La Operator"):
                return new HambOperator();
            default:
                return new HambOdin();
        }
    }
}
