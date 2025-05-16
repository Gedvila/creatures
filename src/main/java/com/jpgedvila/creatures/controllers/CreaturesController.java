package com.jpgedvila.creatures.controllers;

import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.services.CreaturesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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

    @PostMapping
    public ResponseEntity<CreaturesDTO> insert(@RequestBody CreaturesDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CreaturesDTO> update(@PathVariable Long id, @RequestBody CreaturesDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
