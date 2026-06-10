package mock;

import edu.iesam.domain.Pelicula;
import edu.iesam.domain.PeliculaRepository;

import java.util.ArrayList;

public class EmptyRepository implements PeliculaRepository {
    @Override
    public void add(Pelicula pelicula) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Pelicula> getALL() {
        ArrayList<Pelicula> peliculas= new ArrayList<>();
        return peliculas;
    }
}
