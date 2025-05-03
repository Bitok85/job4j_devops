package ru.job4j.devops.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.devops.models.Result;
import ru.job4j.devops.models.TwoArgs;

/**
 * Calculation controller
 */
@RestController
@RequestMapping("calc")
public class CalcController {

    /**
     * Sum
     *
     * @param twoArgs - agrgs
     * @return sum result
     */
    @PostMapping("summarise")
    public ResponseEntity<Result> summarise(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() + twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }

    /**
     * Multiply
     *
     * @param twoArgs - args
     * @return - multiply result
     */
    @PostMapping("times")
    public ResponseEntity<Result> times(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() * twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }
}
