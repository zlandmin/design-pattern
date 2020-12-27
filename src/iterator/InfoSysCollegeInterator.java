package iterator;

import java.util.Iterator;
import java.util.List;

public class InfoSysCollegeInterator implements Iterator {

    private List<Department> departments;
    private int index;

    public InfoSysCollegeInterator(List<Department> departments) {
        this.departments = departments;
        index = -1;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
