package com.example.DnD.Controllers;

import com.example.DnD.Dtos.DnDto;
import com.example.DnD.Models.DnDModel;
import com.example.DnD.Services.DnDService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Ficha")
public class DnDController {
    private final DnDService dndService;
    public DnDController(DnDService dndService){
        this.dndService = dndService;
    }
    @PostMapping
    public ResponseEntity<Object> saveFicha (@RequestBody @Valid DnDto dndDto){
        var dndModel = new DnDModel();
        BeanUtils.copyProperties(dndDto, dndModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(dndService.save(dndModel));
    }
    @GetMapping
    public ResponseEntity<Page<DnDModel>> getAllFichas(@PageableDefault(page=0,size = 10,sort = "id",direction = Sort.Direction.ASC)Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(dndService.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getFichaById(@PathVariable(value = "id")UUID id){
        Optional <DnDModel> optionalDnDModel = dndService.findById(id);
        if(!optionalDnDModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha nao encontrada");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalDnDModel.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFicha(@PathVariable(value = "id")UUID id){
        Optional <DnDModel> optionalDnDModel = dndService.findById(id);
        if(!optionalDnDModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha nao encontrada");
        }
        dndService.delete(optionalDnDModel.get());
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
    }
    @PutMapping("{id}")
    public ResponseEntity<Object> atualizarFicha(@PathVariable(value = "id")UUID id, @RequestBody @Valid DnDto dndDto){
        Optional <DnDModel> optionalDnDModel = dndService.findById(id);
        if(!optionalDnDModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha nao encontrada");
        }
        var dndModel = new DnDModel();
        BeanUtils.copyProperties(dndDto,dndModel);
        dndModel.setId(optionalDnDModel.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(dndService.save(dndModel));
    }

}
