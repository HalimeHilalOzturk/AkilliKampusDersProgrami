public class Classroom {
    private String roomName;
    private int capacity;
    private boolean hasProjector;

    public Classroom(String roomName, int capacity, boolean hasProjector) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.hasProjector = hasProjector;
    }

    public String getRoomName() { 
        return roomName; 
    }
    
    public int getCapacity() { 
        return capacity; 
    }
    
    public boolean isHasProjector() { 
        return hasProjector; 
    }
}