package com.assignment.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	int a;
	int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Calculator() {
		super();
		
	}
	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	public int addition(int a,int b) {
		return a+b;
	}
	public int subtraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public double division(int a,int b) {
		return a/b;	
		}
	public double squareroot(int a2) {
		return Math.sqrt(a2);	
}
}
