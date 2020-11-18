package com.assignment.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Features {

	@JsonProperty("text")
	private String text;
	
	@JsonProperty("properties")
	private Properties properties;
	
	private List<Context> context;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<Context> getContext() {
		return context;
	}

	public void setContext(List<Context> context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "Features [text=" + text + ", properties=" + properties + ", context=" + context + "]";
	}
	
	
	
}
