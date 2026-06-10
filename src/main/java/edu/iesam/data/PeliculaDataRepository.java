package edu.iesam.data;

import edu.iesam.domain.Pelicula;
import edu.iesam.domain.PeliculaRepository;

import java.util.ArrayList;

public class PeliculaDataRepository implements PeliculaRepository {
    PeliculaMemLocalDataSource peliculaMemLocalDataSource;

    public PeliculaDataRepository(PeliculaMemLocalDataSource peliculaMemLocalDataSource){
        this.peliculaMemLocalDataSource=peliculaMemLocalDataSource;
    }

    @Override
    public void add(Pelicula pelicula) {
        this.peliculaMemLocalDataSource.add(pelicula);
    }

    @Override
    public void delete(String id) {
        this.peliculaMemLocalDataSource.delete(id);
    }

    @Override
    public ArrayList<Pelicula> getALL() {
        return peliculaMemLocalDataSource.findAll();
    }
}
