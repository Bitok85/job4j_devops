package ru.job4j.devops.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Result model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    /**
     * Result value
     */
    private double value;
}
