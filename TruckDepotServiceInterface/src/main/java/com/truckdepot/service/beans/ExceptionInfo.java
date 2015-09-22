package com.truckdepot.service.beans;

public class ExceptionInfo {
	private int status;
	private String message;
	private String description;

	public ExceptionInfo(int status, String msg, String desc) {
		this.status = status;
		this.message = msg;
		this.description = desc;
	}

	public ExceptionInfo() {
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
