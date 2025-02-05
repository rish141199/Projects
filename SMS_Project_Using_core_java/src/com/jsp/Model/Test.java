package com.jsp.Model;

public class Test {

	private String name;
	private String std;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

public static void main(String[] args) {
	Test a = new Test();
	a.setName("Rishav");
	a.setStd("B.Tech Pass Out");
	
	System.out.println("Name : "+a.getName());
	System.out.println("Standard : "+a.getStd());
}

}


