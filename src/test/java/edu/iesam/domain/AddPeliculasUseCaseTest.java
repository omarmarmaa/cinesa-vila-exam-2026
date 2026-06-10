package edu.iesam.domain;

import edu.iesam.data.PeliculaDataRepository;
import mock.PeliculasMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddPeliculasUseCaseTest {
    PeliculasMockRepository peliculasMockRepository;
    AddPeliculasUseCase addPeliculasUseCase;
    @Test
    void add() {
        peliculasMockRepository = new PeliculasMockRepository();
        addPeliculasUseCase = new AddPeliculasUseCase(peliculasMockRepository);
        Pelicula pelicula=new Pelicula("hola","2009","infantil","1");
        addPeliculasUseCase.add(pelicula);

        assertEquals(1,peliculasMockRepository.countAddPeliculas);
    }
}