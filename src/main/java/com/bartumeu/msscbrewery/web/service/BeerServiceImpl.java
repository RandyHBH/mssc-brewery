package com.bartumeu.msscbrewery.web.service;

import com.bartumeu.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(beerId)
                .name("Galaxy Cat")
                .style("Pale Ale")
                .build();
    }
}
