package org.james.service.model;

public class Result {
	
	private Object data;
	
	public Result() {
	}

	public Result(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
