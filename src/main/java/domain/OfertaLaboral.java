package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OfertaLaboral {

    private static int cantSemanasBusquedaCerrada;

    private String titulo;
    private String detalleNarrado;
    private List<Tarea> tareas;
    private ModalidadDeContrato modalidadDeContrato;
    private TipoDeTrabajo tipoDeTrabajo;
    private Categoria categoria;
    private double montoOfrecido;
    private FrecuenciaPago frecuenciaPago;
    private LocalDate fechaAlta;
    private LocalDate fechaFin;


    public static void setCantSemanasBusquedaCerrada(int cantSemanasBusquedaCerrada) {
        OfertaLaboral.cantSemanasBusquedaCerrada = cantSemanasBusquedaCerrada;
    }

    public static int getCantSemanasBusquedaCerrada() {
        return cantSemanasBusquedaCerrada;
    }

    public OfertaLaboral(){
        this.tareas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.isEmpty()? this.generarTitulo() : this.titulo;
    }

    public String getDetalleNarrado() {

        return detalleNarrado;
    }

    public void setDetalleNarrado(String detalleNarrado) {

        this.detalleNarrado = detalleNarrado;
    }

    public ModalidadDeContrato getModalidadDeContrato() {
        return modalidadDeContrato;
    }

    public void setModalidadDeContrato(ModalidadDeContrato modalidadDeContrato) {
        this.modalidadDeContrato = modalidadDeContrato;
    }

    public void setTipoDeTrabajo(TipoDeTrabajo tipoDeTrabajo) {
        this.tipoDeTrabajo = tipoDeTrabajo;
    }

    public TipoDeTrabajo getTipoDeTrabajo() {
        return tipoDeTrabajo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setFrecuenciaPago(FrecuenciaPago frecuenciaPago) {
        this.frecuenciaPago = frecuenciaPago;
    }

    public FrecuenciaPago getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setMontoOfrecido(double montoOfrecido) {
        this.montoOfrecido = montoOfrecido;
    }

    public double getMontoOfrecido() {
        return montoOfrecido;
    }

    public void agregarTarea(Tarea tarea){
        this.tareas.add(tarea);
    }

    public void agregarTareas(Tarea ... tareas){
        // Quiero agregar todas las tareas que lleguen a esta coleccion
        // VAR ARGS, PARAMETROS VARIABLES
        Collections.addAll(this.tareas, tareas);
    }

    public void eliminarTarea(Tarea tarea){
        this.tareas.remove(tarea);
    }

    private String generarTitulo(){

        return this.categoria.getNombre() + " - "+ this.tipoDeTrabajo.detalleParaTitulo();
    }
}


