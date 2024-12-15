public class Locker {
    private int id;
    private String userName;
    private int maximumItemLimit = 100;
    private Items[] items;
    private int itemCount;

    public Locker(int id) {
        this.id = id;
        this.userName = userName;
        this.itemCount = 0;
        this.items = new Items[maximumItemLimit];
    }

    public boolean isOccupied() {
        return itemCount > 0;
    }

    public void addItem(Items newItem) {
    for (int i = 0; i < itemCount; i++) 
    {
        if (items[i].getName().equalsIgnoreCase(newItem.getName())) { 
            // If the item already exists, increase its quantity by the new item's frequency
            items[i].incrementFrequency(newItem.getFrequency());
            return; // Exit the method after updating the quantity
        }
    }
    
        // If the item does not exist, add it to the locker
        if (itemCount < maximumItemLimit)
        {
            items[itemCount++] = newItem;
        } else {
            System.out.println("Cannot add more items, locker is full.");
        }
    }
    
   

    public void removeItem(String key) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getKey().equals(key)) {
                items[i] = items[itemCount - 1]; // Replace with the last item
                items[itemCount - 1] = null; // Remove the last item
                itemCount--;
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void clearLocker() {
        items = new Items[maximumItemLimit];
        itemCount = 0;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public Items[] getItems() {
        return items;
    }
}