package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;

import java.util.ArrayList;

public class GetPeliculasUseCase {

    PeliculaRepository peliculaRepository;

    public  GetPeliculasUseCase(PeliculaRepository peliculaRepository){
        this.peliculaRepository=peliculaRepository;
    }

    public ArrayList<Pelicula> GetALL(){
        return  peliculaRepository.getALL();
    }
}
