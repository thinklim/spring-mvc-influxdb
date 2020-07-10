package com.example.controller;

import java.util.List;

import com.example.vo.Temperature;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;
import org.influxdb.impl.InfluxDBResultMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String hello(Model model) {
        InfluxDB influxDB = InfluxDBFactory.connect("http://localhost:8086", "root", "root");
        String dbName = "mydb";
        QueryResult queryResult = influxDB.query(new Query("select * from temperature", dbName));

        InfluxDBResultMapper resultMapper = new InfluxDBResultMapper();
        List<Temperature> temperatures = resultMapper.toPOJO(queryResult, Temperature.class);
        
        
        for (Temperature temperature : temperatures) {
            System.out.println(temperature);
        }

        model.addAttribute("temperatures", temperatures);

        return "hello";
    }
    
}