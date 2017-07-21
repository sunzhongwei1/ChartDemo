package com.entity;

import java.util.List;


public class SeriesData {
	private  String  seriesDataName;
	
	
    public String getSeriesDataName() {
		return seriesDataName;
	}

	public void setSeriesDataName(String seriesDataName) {
		this.seriesDataName = seriesDataName;
	}

	private List<ChartData> data;

    public List<ChartData> getData() {
        return data;
    }

    public void setData(List<ChartData> data) {
        this.data = data;
    }
}
