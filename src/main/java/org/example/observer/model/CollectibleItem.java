package org.example.observer.model;

public class CollectibleItem {
    private CollectibleType collectibleType;
    private String description;

      public CollectibleItem(CollectibleType collectibleType, String description) {
        this.collectibleType = collectibleType;
        this.description = description;
    }

    public CollectibleType getCollectibleType() {
        return collectibleType;
    }

    public void setCollectibleType(CollectibleType collectibleType) {
        this.collectibleType = collectibleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CollectibleItem{" +
                "collectibleType=" + collectibleType +
                ", description='" + description + '\'' +
                '}';
    }
}
