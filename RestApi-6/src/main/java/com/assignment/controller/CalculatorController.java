package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.calculator.Calculator;

@RestController
public class CalculatorController {
	
@Autowired
Calculator cal;
@RequestMapping("/add")
public int addition() {
	return cal.addition(1,2);
}
@RequestMapping("/sub")
public int subtraction() {
	return cal.addition(4,6);
}
@RequestMapping("/mul")
public int multiplication() {
	return cal.addition(9,9);
}
@RequestMapping("/div")
public double division() {
	return cal.addition(9,9);
}
@RequestMapping("/sqt")
public double squareroot() {
	return cal.squareroot(10);
}
}
