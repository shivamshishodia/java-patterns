package com.shishodia.java.patterns.interpreter;

public class SubtractExpression implements Expression {

	private String expression;
	
	public SubtractExpression(String expression) {
		this.expression = expression;
	}
	
	@Override
	public int interpret(InterpreterEngine ie) {
		return ie.subtract(expression);
	}
}
