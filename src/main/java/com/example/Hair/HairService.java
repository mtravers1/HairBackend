package com.example.Hair;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

import jakarta.annotation.PostConstruct;
@Service
public class HairService {
    List<Hair>hair= new ArrayList<>();

    public List<Hair>getall(){
        return hair;
    }

    public void add(Hair h){
        hair.add(h);
    }

    public void update(Hair h){
        hair.removeIf(i->i.getId().equals(h.getId()));
        hair.add(h);
    }

    public void delete(Integer id){
        hair.removeIf(i->i.getId().equals(id));
    }

    

    @PostConstruct
    public void init(){
        Hair a= new Hair(1, "dreads", "Dreads", 2022880295, "dameatis@gmail.com");


        hair.add(a);
    }
}
