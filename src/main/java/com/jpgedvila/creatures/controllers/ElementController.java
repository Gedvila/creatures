package com.jpgedvila.creatures.controllers;

import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.dto.ElementDTO;
import com.jpgedvila.creatures.services.ElementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/element")
public class ElementController {

    private final ElementService service;
    public ElementController(ElementService service){
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ElementDTO> findElementById(@PathVariable Long id) {
        ElementDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}
