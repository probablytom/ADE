package ade;

public class Trait {

	//TODO: Figure out how dynamic comparisons work.
	protected boolean ordered;
	protected boolean comparable;
	protected String name;
	protected Dimension dimension;
	
	public Trait(boolean ordered, boolean comparable) {
		this.ordered = ordered;
		this.comparable = comparable;
	}
	
	// We have to have `Property` types in the arguments here because various properties can have the same traits. How do we know which ones to compare?
	// TODO: Think about this a little, there may be a workaround. Look into Propono more...
	public Integer compareTo(Property otherProperty){
		
		// First, make sure the other property actually has the trait we're looking for. 
		//if 
		
		return 0;
		
	}
	
	
	
}
