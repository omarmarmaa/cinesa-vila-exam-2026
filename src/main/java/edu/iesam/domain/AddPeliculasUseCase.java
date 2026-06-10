package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;

public class AddPeliculasUseCase {

    PeliculaDataRepository peliculaDataRepository;

    public  AddPeliculasUseCase(PeliculaDataRepository peliculaDataRepository){
        this.peliculaDataRepository=peliculaDataRepository;
    }

    public void add(Pelicula pelicula){
        peliculaDataRepository.add(pelicula);
    }
}
