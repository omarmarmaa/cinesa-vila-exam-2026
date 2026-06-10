package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;

public class AddPeliculasUseCase {

    PeliculaRepository peliculaRepository;

    public  AddPeliculasUseCase(PeliculaRepository peliculaRepository){
        this.peliculaRepository=peliculaRepository;
    }

    public void add(Pelicula pelicula){
        peliculaRepository.add(pelicula);
    }
}
