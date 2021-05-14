package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by janaksoni on 5/14/21.
 */

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        return dogRepository.findBreedById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllName();
    }
}
