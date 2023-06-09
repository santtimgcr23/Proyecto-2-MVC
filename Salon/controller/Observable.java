package Salon.controller;

public interface Observable {

    void addObsserver(Observador observer);

    void removerObserver(Observador observer);

}
