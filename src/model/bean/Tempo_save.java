/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Marcos Antonio
 */
public class Tempo_save {
    
    private int idTempo;
    private String Cliente_time;
    private int Segundos;
    private int Minutos;
    private int Horas;
    private String Nome;
    private String CPF;
    private int Tempo_limite;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getTempo_limite() {
        return Tempo_limite;
    }

    public void setTempo_limite(int Tempo_limite) {
        this.Tempo_limite = Tempo_limite;
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getIdTempo() {
        return idTempo;
    }

    public void setIdTempo(int idTempo) {
        this.idTempo = idTempo;
    }

    public String getCliente_time() {
        return Cliente_time;
    }

    public void setCliente_time(String Cliente_time) {
        this.Cliente_time = Cliente_time;
    }

    @Override
    public String toString() {
        return getCliente_time(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
