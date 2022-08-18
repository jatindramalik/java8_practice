public class Empl {

    private int eid;
    private String ename;
    private String dept;
    private double salary;
    public Empl(int eid, String ename, String dept, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.dept = dept;
        this.salary = salary;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dept == null) ? 0 : dept.hashCode());
        result = prime * result + eid;
        result = prime * result + ((ename == null) ? 0 : ename.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empl other = (Empl) obj;
        if (dept == null) {
            if (other.dept != null)
                return false;
        } else if (!dept.equals(other.dept))
            return false;
        if (eid != other.eid)
            return false;
        if (ename == null) {
            if (other.ename != null)
                return false;
        } else if (!ename.equals(other.ename))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Empl [dept=" + dept + ", eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
    }

    
    
}
