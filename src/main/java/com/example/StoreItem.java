package com.example;

public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    private StoreItem(ItemBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.shortDescription = builder.shortDescription;
        this.longDescription = builder.longDescription;
        this.stockAvailable = builder.stockAvailable;
        this.packagingType = builder.packagingType;
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
    public static class ItemBuilder {
        private  String name;
        private  Double price;
        private  String shortDescription;
        private  String longDescription;
        private  Integer stockAvailable;
        private  String packagingType;

        public ItemBuilder(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public ItemBuilder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public ItemBuilder longDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }
        public ItemBuilder stockAvailable(int stockAvailable) {
            this.stockAvailable = stockAvailable;
            return this;
        }
        public ItemBuilder packagingType(String packagingType) {
            this.packagingType = packagingType;
            return this;
        }

        public StoreItem build() {
            return new StoreItem(this);
        } 
        
    } 
}
