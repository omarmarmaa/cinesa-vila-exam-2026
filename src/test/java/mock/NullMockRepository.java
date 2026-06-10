package mock;

import edu.iesam.domain.Pelicula;
import edu.iesam.domain.PeliculaRepository;

import java.util.ArrayList;

public class NullMockRepository implements PeliculaRepository {
    @Override
    public void add(Pelicula pelicula) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Pelicula> getALL() {
        return null;
    }
}
