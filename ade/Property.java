package ade;

import java.util.ArrayList;

public class Property<E extends Comparable<E>> {
	
	protected E value;
	protected String dimensionName;
	
	public Property() {
		
		this.value = null;
		this.dimensionName = "";

	}

	public Property(E value) {
		this.value = value;
		this.dimensionName = "";
	}
	
	public Property(E value, String dimensionName) {
		this.value = value;
		this.dimensionName = dimensionName.toLowerCase();
	}

	public E getValue() {
		return this.value;
	}
	
	public String getDimensionName() {
		return this.dimensionName;
	}

	public void setValue(E newValue) {
		this.value = newValue;
	}
	
	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName.toLowerCase();
	}
	
	public boolean isEquivalent(Property otherProperty) {
		return this.isSameType(otherProperty) && this.value.compareTo((E) otherProperty.getValue()) == 0;
	}
	
	public boolean isSameType(Property otherProperty) {
		return this.dimensionName == otherProperty.getDimensionName();
	}
	
	
}
	
