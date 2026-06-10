package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;

public class DeletePeliculaUseCase {

    PeliculaDataRepository peliculaDataRepository;

    public  DeletePeliculaUseCase(PeliculaDataRepository peliculaDataRepository){
        this.peliculaDataRepository=peliculaDataRepository;
    }

    public void delete(String id){
        this.peliculaDataRepository.delete(id);
    }
}
