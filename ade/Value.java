package ade;

public class Value<E> implements Comparable {
	
	protected Dimension dimension;
	protected E value;

	public Value<E>(Dimension dimension, E value) {

		this.dimension = dimension;
		this.value = value;

	}

	public Value<E>() {
		this.dimension = new Dimension();
		this.value = new E();
	}

	public Dimension getDimension() {
		return this.Dimension;
	}

	public Boolean hasDimension(Dimension otherDimension) {
		return this.dimension.equals(otherDimension);
	}

	public E getValue() {

		return this.value;

	}

	protected void setValue(E value) {
		try {
			this.value = value;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
