package edu.iesam.domain;

import mock.EmptyRepository;
import mock.NullMockRepository;
import mock.PeliculasMockRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetPeliculasUseCaseTest {

    PeliculasMockRepository peliculasMockRepository;
    GetPeliculasUseCase getPeliculasUseCase;
    @Test
    void getALL() {
        peliculasMockRepository=new PeliculasMockRepository();
        getPeliculasUseCase=new GetPeliculasUseCase(peliculasMockRepository);
        ArrayList<Pelicula>peliculas=getPeliculasUseCase.GetALL();
        assertEquals(1,peliculas.size());
    }
    EmptyRepository emptyRepository;

    @Test
    void empty() {
    emptyRepository= new EmptyRepository();
    getPeliculasUseCase=new GetPeliculasUseCase(emptyRepository);
    ArrayList<Pelicula>peliculas=getPeliculasUseCase.GetALL();
    assertEquals(0,peliculas.size());

    }
    NullMockRepository nullMockRepository;
    @Test
    void returnNULL() {
        nullMockRepository=new NullMockRepository();
        getPeliculasUseCase=new GetPeliculasUseCase(nullMockRepository);
        ArrayList<Pelicula>peliculas=getPeliculasUseCase.GetALL();
        assertNull(peliculas);
    }
}