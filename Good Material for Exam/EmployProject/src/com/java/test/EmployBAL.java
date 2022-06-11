package com.java.test;

import java.util.List;

public class EmployBAL {

	static StringBuilder sb = new StringBuilder();
	static EmployDAO dao = new EmployDAO();
	
	public boolean isValid(Employ employ) {
		String[] dept = {"Dotnet","Java","Sql"};
		String[] desig = {"Manager","TeamLead","Swe"};
		
		boolean isValid=true;
		
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No. Cannot be Zero or Negative...\r\n");
			isValid=false;
		}
		
		if (employ.getName().length() < 5) {
			sb.append("Name Contains min. 5 characters...\r\n");
			isValid=false;
		}
		
		if (employ.getDept().trim().equals("Java") || 
				employ.getDept().trim().equals("Dotnet") ||
				employ.getDept().trim().equals("Sql")
				) {
			isValid=true;
		} else {
			isValid=false;
			sb.append("Dept is Either Java or Dotnet or Sql...");
		}
		
		if (employ.getDesig().trim().equals("Manager") || 
				employ.getDesig().trim().equals("TeamLead") ||
				employ.getDesig().trim().equals("Swe")
				) {
			isValid=true;
		} else {
			isValid=false;
			sb.append("Desig is Either Manager or TeamLead or Swe...");
		}
		
		if (employ.getBasic() < 20000 || employ.getBasic() >= 100000) {
			isValid = false;
		}
		return isValid;
	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
	public String addEmployBal(Employ employ) throws EmployException {
		System.out.println(isValid(employ));
		if (isValid(employ)==true) {
			return dao.addEmployDao(employ);
		} else {
			throw new EmployException(sb.toString());
		}
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		System.out.println(isValid(employ));
		if (isValid(employ)==true) {
			return dao.updateEmployDao(employ);
		} else {
			throw new EmployException(sb.toString());
		}
	}
}
