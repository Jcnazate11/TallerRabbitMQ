package com.espe.ms_catalogo.service;

import com.espe.ms_catalogo.dto.CatalogoDto;
import com.espe.ms_catalogo.entity.Catalogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.espe.ms_catalogo.repository.CatalogoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CatalogoService {
    @Autowired
    private CatalogoRepository repository;


    public List<Catalogo> listarTodas(){
        return repository.findAll();
    }
    public void guardar(CatalogoDto dto){
        Catalogo catalogo = new Catalogo();
        catalogo.setTipo(dto.getTipo());
        catalogo.s
        repository.save(catalogo);
    }
}
