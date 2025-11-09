package com.example.dataviz.model;

import lombok.AllArgsConstructor; // Add this line
import lombok.Data; // Add this line

@Data // Generates getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Generates a constructor with all fields
public class DataPoint {

    private String label; // e.g., "Jan", "Feb", "Category A"
    private double value; // e.g., 1500.00, 2200.50, 55

    // Note: Lombok handles the boilerplate code for you!
}
