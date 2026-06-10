package edu.iesam.domain;

import java.util.ArrayList;

public interface PeliculaRepository {

    void add(Pelicula pelicula);
    void delete(String id);
    ArrayList<Pelicula> getALL();
}
