package homeWork01;

public class car {
	private compuleWeight[] myCom=new compuleWeight[]{
		new computer(),new television(),new washMachine()
	};
	public double allWeight(){
		return this.myCom[0].computeWeight()+this.myCom[1].computeWeight()+this.myCom[2].computeWeight();
	}
}
