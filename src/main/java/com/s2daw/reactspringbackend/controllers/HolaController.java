package com.s2daw.reactspringbackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HolaController {
    @RequestMapping(value="api/hora")
    public Map getHora(){
        Map respuesta=new HashMap();
        // Muestro sólo hora y minuto, no muestro segundos
        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("h:mm:ss");
        respuesta.put("Hora", hora.format(f));
        return respuesta;
    }
    @RequestMapping(value="/otro/hora")
    public Map getHora2(){
        Map respuesta=new HashMap();
        // Muestro sólo hora y minuto, no muestro segundos
        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("h:mm:ss");
        respuesta.put("Hora", hora.format(f));
        return respuesta;
    }
    @RequestMapping(value="/index.html")
    public Map getHora3(){
        Map respuesta=new HashMap();
        // Muestro sólo hora y minuto, no muestro segundos
        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("h:mm:ss");
        respuesta.put("Hora", hora.format(f));
        return respuesta;
    }
}
