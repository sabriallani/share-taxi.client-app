package com.panamana.sharetaxi.lines.objects;

import com.google.android.gms.maps.model.LatLng;

/**
 * Line object, contains line parameters (start, end, middle way points, and other parameters)
 * @author naama
 */
public class Line {

	// Fields:
	private String mName;
	private int mColor;
	private float mWidth;
	private LatLng mStart;
	private LatLng mEnd;
	private LatLng [] mWaypoints;

	// Constructor:
	public Line(String name,int color,float width, LatLng start, LatLng end, LatLng[] waypoints) {
		this.mName = name;
		this.mColor = color;
		this.mWidth = width;
		this.mStart = start;
		this.mEnd = end;
		this.mWaypoints = waypoints;
	}

	// getter/setter:
	
	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public LatLng getStart() {
		return mStart;
	}

	public LatLng getEnd() {
		return mEnd;
	}

	public LatLng[] getWaypoints() {
		return mWaypoints;
	}

	public float getWidth() {
		return mWidth;
	}

	public int getColor() {
		return mColor;
	}	
}
