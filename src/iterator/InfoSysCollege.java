package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoSysCollege implements College {

    private List<Department> departments;
    private String name;

    public InfoSysCollege(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department dep = new Department(name, desc);
        departments.add(dep);
    }

    @Override
    public Iterator createIterator() {
        return new InfoSysCollegeInterator(departments);
    }
}
