package homeWork02;

public class test {
	public static void main(String[] args) {
		graduate g01=new graduate();
		g01.setName("zhangsan");
		g01.setFree(5000);
		g01.setPay(1200);
		System.out.println(g01.toString());
		g01.loan();
	}
}
