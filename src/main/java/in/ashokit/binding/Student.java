package in.ashokit.binding;

public class Student {
	private String name;
	private Integer age;
	private String branch;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", branch=" + branch + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
