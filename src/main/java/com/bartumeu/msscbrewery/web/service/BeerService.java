package com.bartumeu.msscbrewery.web.service;

import com.bartumeu.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
}
