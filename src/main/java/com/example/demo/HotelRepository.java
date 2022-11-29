package com.example.demo;
import com.example.demo.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
  public interface HotelRepository extends JpaRepository<Hotel,Integer> {

}
