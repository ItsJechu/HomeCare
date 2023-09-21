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

    public Trabajadorhogar getTrabajadorHogarFavorito(){
        return trabajadorhogar;
    }

    public void setTrabajadorhogarFavorito(Trabajadorhogar trabajadorhogar){
        this.trabajadorhogar=trabajadorhogar;
    }

    public Empleador getEmpleadorFavorito(){
        return empleador;
    }

    public void setEmpleadorFavorito(Empleador empleador){
        this.empleador=empleador;
    }

}

