package com.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 04-12-2020
 */
@RestController
public class GamingController {

    @GetMapping("/games")
    public List<String> getGames(){
        return Stream.of("CS GO","The Warcraft","NFS","The Prince of Persia","Assasins Creed","God of War").collect(Collectors.toList());
    }
}
