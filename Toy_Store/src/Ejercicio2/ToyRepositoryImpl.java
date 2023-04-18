package Ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class ToyRepositoryImpl implements ToyRepository{

    private List<Toy>toys;

    public ToyRepositoryImpl (){
        toys = new ArrayList<>();
    }
    public Toy findById(int Id){
        return toys.stream().filter(toy -> toy.getId() == Id).findFirst().orElse(null);
    }

    @Override
    public List<Toy> findAll() {
        return toys;
    }

    @Override
    public void save(Toy toy) {
        toys.add(toy);
    }

    @Override
    public void update(Toy toy) {
        Toy toy1 = findById(toy.getId());
        if (toy1 != null){
            toys.remove(toy1);
            toys.add(toy);
        }
    }

    @Override
    public void delete(Toy toy) {
        toys.remove(toy);
    }
}
