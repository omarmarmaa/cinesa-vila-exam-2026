package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;

public class DeletePeliculaUseCase {

    PeliculaRepository peliculaRepository;

    public  DeletePeliculaUseCase(PeliculaRepository peliculaRepository){
        this.peliculaRepository=peliculaRepository;
    }

    public void delete(String id){
        this.peliculaRepository.delete(id);
    }
}
