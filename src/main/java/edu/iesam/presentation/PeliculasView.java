package edu.iesam.presentation;

import edu.iesam.data.PeliculaDataRepository;
import edu.iesam.data.PeliculaMemLocalDataSource;
import edu.iesam.domain.AddPeliculasUseCase;
import edu.iesam.domain.DeletePeliculaUseCase;
import edu.iesam.domain.GetPeliculasUseCase;
import edu.iesam.domain.Pelicula;

public class PeliculasView {

    public static void add(){
        AddPeliculasUseCase addPeliculasUseCase= new AddPeliculasUseCase(new PeliculaDataRepository(PeliculaMemLocalDataSource.getInstance()));
        Pelicula pelicula= new Pelicula("starwars","2010","fantasia","1");
        addPeliculasUseCase.add(pelicula);
    }

    public  static  void get(){
        GetPeliculasUseCase getPeliculasUseCase=new GetPeliculasUseCase(new PeliculaDataRepository(PeliculaMemLocalDataSource.getInstance()));
        System.out.println("lista de peliculas"+getPeliculasUseCase.GetALL());
    }

    public  static  void delete(){
        DeletePeliculaUseCase deletePeliculaUseCase=new DeletePeliculaUseCase(new PeliculaDataRepository(PeliculaMemLocalDataSource.getInstance()));
        deletePeliculaUseCase.delete("1");
    }

    public static void function1(){
        get();
    }

    public static void function2(){
        get();
        add();
        get();
    }
    public static void function3(){
        get();
        delete();
        get();
    }
}
