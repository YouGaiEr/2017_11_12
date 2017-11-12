package homeWork01;

public class television implements compuleWeight{
	private double weight;
	public television(){
		this.weight=1200;
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
