package com.training.exceptions;

public class RangeCheckException extends Exception {
	
	private long bookNumber;

	public RangeCheckException(long bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.bookNumber+"should be 1000-10000";
	}
	
	

}
