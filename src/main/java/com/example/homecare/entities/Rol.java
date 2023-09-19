package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {

    private String rolDeUsuario;

    public Rol(String rolDeUsuario) {
        this.rolDeUsuario = rolDeUsuario;
    }

    public String getRolDeUsuario() {
        return rolDeUsuario;
    }

    public void setRolDeUsuario(String rolDeUsuario) {
        this.rolDeUsuario = rolDeUsuario;
    }
    @Override
    public String toString() {
        return "RolUsuario [rolDeUsuario=" + rolDeUsuario + "]";
    }
}



