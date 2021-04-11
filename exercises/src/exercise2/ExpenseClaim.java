package exercise2;

import java.util.*;

public class ExpenseClaim {
    private Staff filedBy;
    private FullTime approvedBy;
    private List<Item> items;
    private Date date;

    public ExpenseClaim(Staff filedBy, Date date) {
        this.filedBy = filedBy;
        items = new ArrayList<>();
        this.date = date;
    }

    public Staff getFiledBy() {
        return filedBy;
    }

    public void setFiledBy(Staff filedBy) {
        this.filedBy = filedBy;
    }

    public FullTime getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(FullTime approvedBy) {
        this.approvedBy = approvedBy;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
