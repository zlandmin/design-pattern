package iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return departments[position++];
    }
}
