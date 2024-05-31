package Com.Spring;

public class Employee {
	
		private int id;
		private String ename; 
		private String design;
		private int salary;
		public Employee(){
			
			super();	
		}
	public Employee(int id, String ename, String design, int salary) {
			super();
			this.id = id;
			this.ename = ename;
			this.design = design;
			this.salary = salary;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getDesign() {
			return design;
		}
		public void setDesign(String design) {
			this.design = design;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", ename=" + ename + ", design=" + design + ", salary=" + salary + "]";
		}
}
		
		