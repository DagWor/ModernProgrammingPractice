package exercise2;

import java.util.*;

public class Department {
    private String name;
    private List<Staff> staff;
    private Company company;

    public Department(String name, Company company) {
        this.name = name;
        this.company = company;
        this.staff = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
