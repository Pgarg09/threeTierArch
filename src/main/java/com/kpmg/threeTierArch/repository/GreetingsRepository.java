package com.kpmg.threeTierArch.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingsRepository {

    public String getGreetings(String name){
        return "Hello "+name+". Please have a nice day.";
    }
}
