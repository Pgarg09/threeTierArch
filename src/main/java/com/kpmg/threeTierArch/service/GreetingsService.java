package com.kpmg.threeTierArch.service;

import com.kpmg.threeTierArch.repository.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    @Autowired
    GreetingsRepository repo;
    public String getGreetings(String name) {
        String message = repo.getGreetings(name);
        return message;

    }
}
