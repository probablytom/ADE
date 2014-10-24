package ade;

import java.util.ArrayList;

// An artifact datastructure.
public class Artifact {
	
	// All of an artifact's properties.
	public ArrayList<Property> properties;
	private static Integer instance = 0; // The number of artifacts.
	public String name; // A non-unique name.
	private Integer id; // A unique object ID.
	
	public Artifact(ArrayList<Property> properties) {
		this.properties = properties;
		instance++;
		this.id = instance;
		this.name = id.toString();
	}
	
	public Artifact(ArrayList<Property> properties, String name) {
		this.properties = properties;
		this.name = name;
		instance++;
		this.id = instance;
	}
	
	// Check that an artifact has a property.
	public boolean hasProperty(Property possibleProperty) {
		return this.properties.contains(possibleProperty);
	}
	
	// Pointless???
	public Property returnProperty(Property possibleProperty) {
		if (this.properties.contains(possibleProperty)) {
			return this.properties.get( this.properties.indexOf(possibleProperty) );
		} else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public ArrayList<Property> similarProperties(Artifact otherArtifact) {
		ArrayList<Property> returnable = new ArrayList<Property>();
		
		for (Property currentProperty : this.properties) {
			if (otherArtifact.hasProperty(currentProperty)) {
				returnable.add(currentProperty);
			}
		}
		
		return returnable;
	}

}
