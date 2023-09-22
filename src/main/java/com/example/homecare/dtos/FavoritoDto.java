package com.example.homecare.dtos;

import com.example.homecare.entities.Empleador;
import com.example.homecare.entities.Trabajadorhogar;

public class FavoritoDto {
    
    private int idFavorito;

    private Trabajadorhogar trabajadorhogar;

    private Empleador empleador;

    public int getIdFavorito(){
        return idFavorito;
    }

    public void setIdFavorito(int idFavorito){
        this.idFavorito=idFavorito;
    }

    public Trabajadorhogar getTrabajadorhogar(){
        return trabajadorhogar;
    }

    public void setTrabajadorhogar(Trabajadorhogar trabajadorhogar){
        this.trabajadorhogar=trabajadorhogar;
    }

    public Empleador getEmpleador(){
        return empleador;
    }

    public void setEmpleador(Empleador empleador){
        this.empleador=empleador;
    }

}

