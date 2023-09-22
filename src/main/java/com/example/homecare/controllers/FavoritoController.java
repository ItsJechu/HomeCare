package com.example.homecare.controllers;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.homecare.dtos.FavoritoDto;
import com.example.homecare.entities.Favorito;
import com.example.homecare.serviceinterfaces.IFavoritoService;

@RestController
@RequestMapping("/favorito")
public class FavoritoController {
    
    @Autowired
    private IFavoritoService fS;

    @PostMapping
    public void insert(@RequestBody FavoritoDto dto){
        ModelMapper m=new ModelMapper();
        Favorito f=m.map(dto, Favorito.class);
        fS.insert(f);
    }

    @GetMapping
    public java.util.List<FavoritoDto> list(){
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, FavoritoDto.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){fS.delete(id);}
}
