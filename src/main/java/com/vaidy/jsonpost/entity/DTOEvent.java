package com.vaidy.jsonpost.entity;

import java.util.Calendar;

public class DTOEvent {

	private String eventType;
	private String eventId;
	private Message message;
	private String status;
	private Calendar originallyEmittedAt;
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Calendar getOriginallyEmittedAt() {
		return originallyEmittedAt;
	}
	public void setOriginallyEmittedAt(Calendar originallyEmittedAt) {
		this.originallyEmittedAt = originallyEmittedAt;
	}
	@Override
	public String toString() {
		return "DTOEvent [eventType=" + eventType + ", eventId=" + eventId + ", message=" + message + ", status="
				+ status + ", originallyEmittedAt=" + originallyEmittedAt + "]";
	}
	
	
}
