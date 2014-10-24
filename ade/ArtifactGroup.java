package ade;

import java.util.ArrayList;

public class ArtifactGroup {

	public Property commonProperty;
	public ArrayList<Artifact> artifacts;
	
	// Create the group and record the property it shares. 
	public ArtifactGroup(Property commonProperty) {
		this.commonProperty = commonProperty;
		this.artifacts = new ArrayList<Artifact>();
	}
	
	public ArtifactGroup(Property commonProperty, Artifact firstArtifact) {
		this.commonProperty = commonProperty;
		this.artifacts = new ArrayList<Artifact>();
		this.artifacts.add(firstArtifact);
	}
		
	// Add an artifact to the group.
	public void addArtifact(Artifact newArtifact) {
		
		// If we haven't seen this artifact yet, create it.
		if ( !(this.artifacts.contains(newArtifact)) ) {
			
			// If the artifact really belongs to this group, permit the addition.
			if (newArtifact.hasProperty(this.commonProperty)) {
				this.artifacts.add(newArtifact);
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		return this.commonProperty.getDimensionName();
	}
	
}
