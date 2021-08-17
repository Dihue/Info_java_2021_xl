package com.informatorio.ejemplo.controller;

import com.informatorio.ejemplo.entity.Empleado;
import com.informatorio.ejemplo.repository.EmpleadoRepository;
import com.informatorio.ejemplo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository repository;

    @RequestMapping(value = "/empleados",method = RequestMethod.GET)
    public @ResponseBody Iterable<Empleado> findEmpleados() {
        return repository.findAll();
    }

    private HelloService helloService;

    @Autowired
    public EmpleadoController(EmpleadoRepository repository, HelloService helloService) {
        this.repository = repository;
        this.helloService = helloService;
    }

    @GetMapping(value = "/saludar")
    public @ResponseBody String saludar() {
        return helloService.saludar();
    }
/*
    @Autowired
    private EmpleadoRepository repository;

    @RequestMapping(value = "/empleados", method = RequestMethod.GET)
    public @ResponseBody Iterable<Empleado> findEmpleados() {
        return repository.findAll();
    }
*/
}