package org.perso.controller;

import org.modelmapper.ModelMapper;
import org.perso.model.dto.ComplexObjectDto;
import org.perso.model.entity.ComplexObjectEntity;
import org.perso.repository.ComplexObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class tutoController {

    @Autowired
    private ComplexObjectRepository complexObjectRepository;

    private final ModelMapper mapper = new ModelMapper();

    //@RequestMapping(value = "/find-tuto-complex-object", method = RequestMethod.GET, produces="application/json")
    @GetMapping("/tuto-complex-object")
    public ResponseEntity<List<ComplexObjectDto>> getTutoComplexObject(){
        ComplexObjectDto dto = new ComplexObjectDto(1, "randomLbl", "radnomCommentaire");

        return ResponseEntity.ok(complexObjectRepository.findAll().stream().map(entity -> mapper.map(entity, ComplexObjectDto.class)).toList());
    }

    @PostMapping("/tuto-complex-object")
    public ResponseEntity<ComplexObjectDto> createComplexObject(@RequestBody ComplexObjectDto complexObjectDto){
        //
        //, consumes = "application/json"
       // ComplexObjectDto complexObjectDto = new ComplexObjectDto();

        ComplexObjectEntity entity = complexObjectRepository.save(mapper.map(complexObjectDto, ComplexObjectEntity.class));

        return ResponseEntity.ok(mapper.map(entity, ComplexObjectDto.class));
    }
}