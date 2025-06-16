package com.espe.ms_catalogo.listener;

import com.espe.ms_catalogo.dto.CatalogoDto;
import com.espe.ms_catalogo.service.CatalogoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatalogoListener {
    @Autowired
    private CatalogoService service;

    @Autowired
    private ObjectMapper mapper;
    @RabbitListener(queues = "catalogo.cola")
    public void recibirMensajes(String mensaje){
        try{
            CatalogoDto dto = mapper.readValue(mensaje, CatalogoDto.class);
            service.guardar(dto);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    
}
