package adeExample;

import java.util.ArrayList;
import ade.*;

public class BasicEngine {

	public static void main(String[] args) {
		
		ArrayList<Property> chunkyProperties = new ArrayList<Property>();
		chunkyProperties.add( new Property(5, "int") );
		chunkyProperties.add( new Property((float) 5, "float") );
		chunkyProperties.add( new Property("chunky", "name") );
		
		ArrayList<Property> baconProperties = new ArrayList<Property>();
		baconProperties.add( new Property(5, "double") );
		baconProperties.add( new Property((float) 5, "float") );
		baconProperties.add( new Property("bacon", "name") );
		
		Governer governer = new Governer();
		governer.addArtifact(new Artifact(chunkyProperties, "Chunky"));
		governer.addArtifact(new Artifact(baconProperties, "Bacon"));
		
		governer.spillArtifacts();
		System.out.println();
		governer.spillGroups();

	}

}