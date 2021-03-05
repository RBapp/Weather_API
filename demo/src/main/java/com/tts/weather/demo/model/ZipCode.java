package com.tts.weather.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "WeatherZipCodes")
@NoArgsConstructor
@Data
@AllArgsConstructor

public class ZipCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String zipCode;

    @CreatedDate
    private Date createdAt;



}
