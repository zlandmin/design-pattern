package iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    private Department[] departments;
    private int num;
    private int capacity;
    private String name;

    public ComputerCollege(String name, int capacity) {
        this.capacity = capacity;
        this.name = name;
        this.num = 0;
        this.departments = new Department[capacity];
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addDepartment(String name, String desc) {
        if (num < capacity) {
            Department dep = new Department(name, desc);
            this.departments[num++] = dep;
        } else {
            System.out.println("not able to add department any more....");
        }
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
