package mock;

import edu.iesam.domain.Pelicula;
import edu.iesam.domain.PeliculaRepository;

import java.util.ArrayList;

public class PeliculasMockRepository implements PeliculaRepository {

    public Integer countAddPeliculas=0;
    public Integer countDeletePeliculas=0;

    @Override
    public void add(Pelicula pelicula) {
        countAddPeliculas++;
    }

    @Override
    public void delete(String id) {
        countDeletePeliculas++;
    }

    @Override
    public ArrayList<Pelicula> getALL() {
        ArrayList<Pelicula> peliculas=new ArrayList<>();
        Pelicula pelicula=new Pelicula("toy story","2005","infantil","1");
        peliculas.add(pelicula);
        return peliculas;
    }
}
