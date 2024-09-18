package com.example.Hair;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class HairController {
    @Autowired
    private final HairService service;

    public HairController(HairService service){
        this.service=service;
    }
    @GetMapping("/")
    public List<Hair> getall(){
        return service.getall();
    }

    @PostMapping("/")
    public void add(Hair hair){
        service.add(hair);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Hair h){
        service.update(h);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
