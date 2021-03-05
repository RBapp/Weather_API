package com.tts.weather.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Request {


    private String zipCode;
}
