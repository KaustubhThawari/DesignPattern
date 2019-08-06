package com.chain.of.responsiblity;

public class Number {

	private Integer number1;
	private Integer number2;
	public String calculationType;
	
	public Number(Integer number1, Integer number2, String calculationType) {
		this.number1 = number1;
		this.number2 = number2;
		this.calculationType = calculationType;
	}
	public Integer getNumber1() {
		return number1;
	}
	public void setNumber1(Integer number1) {
		this.number1 = number1;
	}
	public Integer getNumber2() {
		return number2;
	}
	public void setNumber2(Integer number2) {
		this.number2 = number2;
	}
	public String getCalculationType() {
		return calculationType;
	}
	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}
}
