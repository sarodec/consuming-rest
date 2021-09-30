package src.main.java.consumingrest;

public class Item {
    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode=" + itemCode +
                ", itemDesc='" + itemDesc + '\'' +
                '}';
    }

    public Item(int itemCode, String itemDesc) {
        this.itemCode = itemCode;
        this.itemDesc = itemDesc;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    private int itemCode;
    private String itemDesc;
}
