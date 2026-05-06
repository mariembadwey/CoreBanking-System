package model;

public class Transaction {
    private String type;
    private String category;
    private double amount ;
    public Transaction(String t , String c ,double a ){
        this.type=t;
        this.category = c;
        this.amount =a;
    }
    public void set_type(String t){
        this.type=t;
    }
    public void set_categ(String c){
        this.category = c;
    }
    public void set_amount(double a){
        this.amount =a;
    }
    public String get_type(){
        return type;
    }
    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

}
