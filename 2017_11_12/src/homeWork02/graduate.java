package homeWork02;

public class graduate implements studentManageInterface, teacherManageInterface {
	private String name;
	private String sex;
	private int age;
	private float free;
	private float pay;
	public graduate() {
		// TODO Auto-generated constructor stub
		this.name="NULL";
		this.sex="NULL";
		this.age=0;
		this.free=0;
		this.pay=0;
	}
	public void loan(){
		if((this.pay*12-this.free)<2000){
			System.out.println("需要贷款");
		}else{
			System.out.println("不需要贷款");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void setPay(float money) {
		// TODO Auto-generated method stub
		this.pay=money;
	}

	@Override
	public float getPay() {
		// TODO Auto-generated method stub
		return this.pay;
	}

	@Override
	public void setFree(float money) {
		// TODO Auto-generated method stub
		this.free=money;
	}

	@Override
	public float getFree() {
		// TODO Auto-generated method stub
		return this.free;
	}
	@Override
	public String toString() {
		return "graduate [name=" + name + ", sex=" + sex + ", age=" + age
				+ ", free=" + free + ", pay=" + pay + "]";
	}

}
