package com.example.dataviz.service;

import com.example.dataviz.model.DataPoint;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service // Marks this class as a Spring Service component
public class DataAnalysisService {

    /**
     * This method simulates fetching aggregated sales data.
     */
    public List<DataPoint> getMonthlySalesData() {
        // In a real application, you would query a database here.
        // For now, we use simple mock data.
        return Arrays.asList(
                new DataPoint("January", 1500.00),
                new DataPoint("February", 2200.50),
                new DataPoint("March", 1850.75),
                new DataPoint("April", 3100.25),
                new DataPoint("May", 2500.00)
        );
    }
}