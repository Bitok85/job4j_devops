package ru.job4j.devops.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Args model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoArgs {

    /**
     * first value
     */
    private double first;

    /**
     * second value
     */
    private double second;
}
