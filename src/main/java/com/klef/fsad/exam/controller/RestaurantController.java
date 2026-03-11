package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return service.addRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> getRestaurants() {
        return service.getAllRestaurants();
    }
}