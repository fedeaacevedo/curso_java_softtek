package domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Postulante {
    @Setter
    private String nombre;
    @Setter
    private String apellido;
    @Setter
    private LocalDate fechaNacimiento;
    private List<Nacionalidad> nacionalidades;
    private List<Idioma> idiomas;
    private List<Categoria> categorias;

    // SIEMPRE QUE TENGO COLECCIONES DEBO INICIALIZAR
    public Postulante(){
        this.nacionalidades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public void agregarNacionalidades(Nacionalidad ... nacionalidades){
        Collections.addAll(this.nacionalidades, nacionalidades);
    }

    public void agregarIdiomas(Idioma ... idiomas){
        Collections.addAll(this.idiomas, idiomas);
    }

    public void agregarIntereses(Categoria ... categorias){
        Collections.addAll(this.categorias, categorias);
    }
}
