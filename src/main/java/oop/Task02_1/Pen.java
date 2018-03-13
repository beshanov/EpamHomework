package oop.Task02_1;

public class Pen {
    private int price;
    private String mark;
    private int size;

    
    public Pen(int price, int size, String mark){
        this.price = price;
        this.size = size;
        this.mark = mark;
    }

    public int getsize() {
        return size;
    }

    public void setsize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Pen pen = (Pen)obj;
        return (price == pen.price)
                && (size == pen.size)
                && ((mark == pen.mark) || ((mark != null) && mark.equals(pen.getMark())));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + size;
        result = (prime * result) + price + (((mark == null) ? 0 : mark.hashCode()));
        return result;
    }

    @Override
    public String toString(){
        return "Pen mark: " + mark + ", size: " + size + ", price: " + price;
    }
}
