package ade;

import java.util.ArrayList;

public class Governer {

	private ArrayList<Property> properties;
	private ArrayList<ArtifactGroup> artifactGroups;
	private ArrayList<Artifact> artifacts;
	private ArrayList<Trait> traits;

	public Governer() {

		this.properties = new ArrayList<Property>();
		this.artifactGroups = new ArrayList<ArtifactGroup>();
		this.artifacts = new ArrayList<Artifact>();
		this.traits = new ArrayList<Trait>();

	}

	// Add an artifact to our collection.
	public void addArtifact(Artifact newArtifact) {

		// Record the artifact in the universal set.
		this.artifacts.add(newArtifact);

		// Also add the artifact to all relevant groups.
		for (Property newProperty : newArtifact.properties) {
			this.addToGroupWithProperty(newProperty, newArtifact);
		}

	}

	private ArtifactGroup findGroupWithProperty(Property commonProperty) {

		// Return the group with the desired property if it's there to be found.
		for (ArtifactGroup group : this.artifactGroups) {
			if (group.commonProperty == commonProperty) {
				return group;
			}
		}

		// We found nothing. Return an empty group. (Change to `null`?)
		return new ArtifactGroup(commonProperty);
	}

	private void addToGroupWithProperty(Property commonProperty,
			Artifact newArtifact) {

		// Search for the group to find.
		// Don't be naive, quit when we can.
		boolean found = false;
		for (ArtifactGroup group : this.artifactGroups) {

			if (group.commonProperty.isSameType(commonProperty)) {
				group.addArtifact(newArtifact);
				found = true;
			}

			if (found)
				break;

		}

		// If we never found it, create a new group for it to go into.
		if (!found) {
			// Add a new ArtifactGroup with the common property and the new
			// artifact.
			this.artifactGroups.add(new ArtifactGroup(commonProperty,
					newArtifact));
		}

	}

	public void spillArtifacts() {
		for (Artifact currentArtifact : this.artifacts) {
			System.out.println(currentArtifact.toString());
		}
	}

	public void spillGroups() {
		for (ArtifactGroup currentGroup : this.artifactGroups) {
			System.out.println(currentGroup.toString());
		}
	}

}
