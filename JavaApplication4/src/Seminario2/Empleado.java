/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seminario2;

/**
 *
 * @author caser
 */
public class Empleado {

    private String nombre;
    private float salario;
    private int anyoAlta;

    public Empleado(String nombre, float salario, int anyoAlta) {
        this.nombre = nombre;
        this.salario = salario;
        this.anyoAlta = anyoAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAnyoAlta() {
        return anyoAlta;
    }

    public void setAnyoAlta(int anyoAlta) {
        this.anyoAlta = anyoAlta;
    }

    public void incSalario(float subida) {

        salario += subida;

    }

}

