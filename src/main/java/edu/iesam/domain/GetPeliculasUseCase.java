package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;

import java.util.ArrayList;

public class GetPeliculasUseCase {

    PeliculaDataRepository peliculaDataRepository;

    public  GetPeliculasUseCase(PeliculaDataRepository peliculaDataRepository){
        this.peliculaDataRepository=peliculaDataRepository;
    }

    public ArrayList<Pelicula> GetALL(){
        return  peliculaDataRepository.getALL();
    }
}
