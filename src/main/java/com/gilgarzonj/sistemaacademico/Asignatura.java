/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gilgarzonj.sistemaacademico;

/**
 *
 * @author HP
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    private String docente;

    public Asignatura() {
    }

    public Asignatura(String Codigo, String nombre, int creditos, String docente) {
        this.codigo = Codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the docente
     */
    public String getDocente() {
        return docente;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString(){
        return "codigo: "+ codigo+
               "nombre: "+ nombre+
               "creditos"+ creditos+
               "docentes"+ docente;
    }
}

