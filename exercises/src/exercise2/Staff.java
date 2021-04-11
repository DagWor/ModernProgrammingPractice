package exercise2;

import java.util.*;

public class Staff {
    private List<Role> role;
    private String name;
    private Department department;
    private List<ExpenseClaim> expenseClaims;

    public Staff(List<Role> role, String name, Department department) {
        this.role = role;
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public List<ExpenseClaim> getExpenseClaims() {
        return expenseClaims;
    }

    public void setExpenseClaims(List<ExpenseClaim> expenseClaims) {
        this.expenseClaims = expenseClaims;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
