package com.espe.ms_catalogo.controller;

import com.espe.ms_catalogo.entity.Catalogo;
import com.espe.ms_catalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogos")
public class CatalogoController {

    @Autowired
    private CatalogoService service;

    @GetMapping
    public List<Catalogo> listarTodas(){
        return service.listarTodas();
    }
}
