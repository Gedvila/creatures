package com.jpgedvila.creatures.controllers;

import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.services.CreaturesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/creatures")
public class CreaturesController {

    private final CreaturesService service;
    public CreaturesController(CreaturesService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CreaturesDTO>findById(@PathVariable Long id) {
        CreaturesDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }


}
