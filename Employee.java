package pgm1;

public class Employee {
	String EmpName;
	int EmpId;
	double EmpSalary;
	
	Employee( String EmpName,int EmpId,double EmpSalary)
	{ 
			this.EmpName=EmpName;
			this.EmpId=EmpId;
			this.EmpSalary=EmpSalary;			
	}
	void display_details()
	{
		System.out.println("Employee name:"+this.EmpName);
		System.out.println("Employee id:"+this.EmpId);
		System.out.println("Employee salary:"+this.EmpSalary);
	}
	void increse_Salary(double percentage)
	{
		double increment=(percentage*this.EmpSalary)/100;
		double incresed_Salary=this.EmpSalary+increment;
		System.out.println("the salary incresed is :"+incresed_Salary);
		this.EmpSalary=incresed_Salary; //updates the current salary//
	}
		public static void main(String[] args) {
			Employee e1 = new Employee("hardik",90,40000);
			Employee e2 = new Employee("sanath",99,35000);
			
			System.out.println("initial Employee details");
			e1.display_details();
			e2.display_details();
			e1.increse_Salary(9);
			e2.increse_Salary(15);
			e1.display_details();
			e2.display_details();
		}
	}

