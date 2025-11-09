package com.example.dataviz.controller;

import com.example.dataviz.model.DataPoint;
import com.example.dataviz.service.DataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // Makes this class a RESTful web service controller
@RequestMapping("/api/data") // Base path for all methods in this controller
@CrossOrigin(origins = "*") // IMPORTANT: Allows a frontend (e.g., HTML file) to access this API
public class DataVizController {

    @Autowired // Spring automatically provides an instance of the service
    private DataAnalysisService dataAnalysisService;

    // This method will be accessible at: http://localhost:8080/api/data/sales
    @GetMapping("/sales")
    public List<DataPoint> getSalesSummary() {
        // Returns a JSON list of DataPoint objects
        return dataAnalysisService.getMonthlySalesData();
    }
}