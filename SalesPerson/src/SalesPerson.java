
public class SalesPerson {
	static final int SALARY_TIMES = 25;
	private String firstName;
	private String lastName;
	private double week1;
	private double week2;
	private double week3;
	private double week4;

public SalesPerson(String lastName, String firstName, double week1, double week2, double week3, double week4) {
	this.lastName = lastName;	
	this.firstName = firstName;
		
		if (this.week1 >= 0) {
			this.week1 = week1;
		}
		if (this.week2 >= 0) {
			this.week2 = week2;
		}
		if (this.week3 >= 0) {
			this.week3 = week3;
		}
		if (this.week4 >= 0) {
			this.week4 = week4;
		}
	}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public double getWeek1() {
	return week1;
}

public double getWeek2() {
	return week2;
}

public double getWeek3() {
	return week3;
}

public double getWeek4() {
	return week4;
}

public void setWeek1(double week1) {
	if (this.week1 >= 0) {
		this.week1 = week1;
	}
	this.week1 = week1;
}
public void setWeek2(double week2) {
	if (this.week2 >= 0) {
		this.week2 = week2;
	}
	this.week2 = week2;
}

public void setWeek3(double week3) {
	if (this.week3 >= 0) {
		this.week3 = week3;
	}
	this.week3 = week3;
}

public void setWeek4(double week4) {
	if (this.week4 >= 0) {
		this.week4 = week4;
	}
	this.week4 = week4;
}
public double getTotalSales() {
	return week1 + week2 + week3 + week4;
}
public double getSalary() {
	return getTotalSales() * SALARY_TIMES;
}


}
