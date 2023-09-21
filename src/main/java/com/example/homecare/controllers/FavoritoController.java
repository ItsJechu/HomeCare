package com.example.homecare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homecare.dtos.FavoritoDto;
import com.example.homecare.serviceinterfaces.IFavoritoService;

@RestController
@RequestMapping("/favoritos")
public class FavoritoController {
    
    @Autowired
    private IFavoritoService fS;

    @PostMapping
    public void registrarFavorito(@RequestBody FavoritoDto dto){

    }
}
