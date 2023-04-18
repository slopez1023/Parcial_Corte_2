package Ejercicio2;

import Ejercicio2.Toy;


import java.util.List;


public interface ToyRepository {
    Toy findById(int Id);
    List<Toy> findAll();
    void save (Toy toy);
    void update (Toy toy);
    void delete (Toy toy);
}
