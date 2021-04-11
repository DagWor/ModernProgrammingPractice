package exercise2;

public class Item {
    private String desc;
    private Float amount;
    private Category category;
    private ExpenseClaim expenseClaim;

    public Item(String desc, Float amount, Category category, ExpenseClaim expenseClaim) {
        this.desc = desc;
        this.amount = amount;
        this.category = category;
        this.expenseClaim = expenseClaim;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ExpenseClaim getExpenseClaim() {
        return expenseClaim;
    }

    public void setExpenseClaim(ExpenseClaim expenseClaim) {
        this.expenseClaim = expenseClaim;
    }
}
