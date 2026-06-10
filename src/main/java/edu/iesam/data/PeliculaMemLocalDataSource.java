package edu.iesam.data; //cambiar por la ruta correcta

import edu.iesam.domain.Pelicula;

import java.util.ArrayList;
import java.util.Objects;

public class PeliculaMemLocalDataSource {

    private static PeliculaMemLocalDataSource instance;

    private ArrayList<Pelicula> storage = new ArrayList<>();

    public ArrayList<Pelicula> findAll() {
        return storage;
    }

    public void add(Pelicula pelicula) {
        storage.add(pelicula);
    }

    public void delete(String idPelicula) {
        storage.removeIf(pelicula ->Objects.equals(pelicula.getId(),idPelicula));
    }

    public static PeliculaMemLocalDataSource getInstance() {
        if (instance==null){
            instance=new  PeliculaMemLocalDataSource();
        }
        return instance;
    }
}
