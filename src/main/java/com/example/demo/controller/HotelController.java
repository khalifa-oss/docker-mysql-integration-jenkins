package com.example.demo.controller;

import com.example.demo.HotelRepository;
import com.example.demo.ServiceHotels;
import com.example.demo.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/hello")
    public String display() {
        return "hello world";
    }

    @RequestMapping("/get")
    public List<Hotel> getBooking() {
        return hotelRepository.findAll();
    }


}
