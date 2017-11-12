package homeWork01;

public class washMachine implements compuleWeight{
	private double weight;
	public washMachine() {
		// TODO Auto-generated constructor stub
		this.weight=1300;
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
