package com.costume.controller;

import com.costume.model.Costume;
import com.costume.service.CostumeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */

@RestController
@RequestMapping("/api/Costume")
@CrossOrigin("*")
public class CostumeController {
    @Autowired
    private CostumeService costumeService;
    
    @GetMapping("/all")
    public List<Costume> getAll(){
        return costumeService.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Costume save(@RequestBody Costume costume){
        return costumeService.save(costume);
    }
}
