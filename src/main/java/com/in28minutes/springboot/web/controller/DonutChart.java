package com.in28minutes.springboot.web.controller;

import java.util.List;

public class DonutChart extends CoreChart {
	private final List<Object> cols;
    private final List<Object> rows;
    
    
	public DonutChart(List<Object> cols, List<Object> rows) {
		super();
		this.cols = cols;
		this.rows = rows;
	}
	public List<Object> getCols() {
		return cols;
	}
	public List<Object> getRows() {
		return rows;
	}
    
    
}
