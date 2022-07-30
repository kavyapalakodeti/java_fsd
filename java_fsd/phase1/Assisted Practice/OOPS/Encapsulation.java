package encapsulation;

class Encap {
private int securitycode;
private  String branchname;
private int branch_code;
private  String dept_name;
private int deptcode;

	public int getSecuritycode() {
	return securitycode;
}

public void setSecuritycode(int securitycode) {
	this.securitycode = securitycode;
}

public String getBranchname() {
	return branchname;
}

public void setBranchname(String branchname) {
	this.branchname = branchname;
}

public int getBranch_code() {
	return branch_code;
}

public void setBranch_code(int branch_code) {
	this.branch_code = branch_code;
}

public String getDept_name() {
	return dept_name;
}

public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}

public int getDeptcode() {
	return deptcode;
}

public void setDeptcode(int deptcode) {
	this.deptcode = deptcode;
}
}
public class Encapsulation{
	public static void main(String[] args) {
		Encap e=new Encap();
		e.setSecuritycode(256);
		e.setBranchname("CSE");
		e.setBranch_code(1);
		e.setDept_name("education");
		e.setDeptcode(22);
		System.out.print("SecurityCode : " + e.getSecuritycode() + "\nBranchname: " + e.getBranchname()+"\nBranch_code: "+e.getBranch_code()
		+"\nDept_name: "+e.getDept_name()+"\nDeptcode: "+e.getDeptcode());
		
		
	}
}

	


