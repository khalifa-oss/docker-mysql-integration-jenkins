package com.example.demo;

import com.example.demo.model.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
	public CommandLineRunner start(HotelRepository hotelRepository){
		List<Hotel> list= Arrays.asList( new Hotel( null,"beach" ), new Hotel(null, "rosa" ), new Hotel( null,"palmier" ) );
		return args -> {
			hotelRepository.saveAll( list);
		};
	}

}
