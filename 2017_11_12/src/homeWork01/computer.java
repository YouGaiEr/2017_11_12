package homeWork01;

public class computer implements compuleWeight{
	private double weight;
	public computer(){
		this.weight=1000;
	}
	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
