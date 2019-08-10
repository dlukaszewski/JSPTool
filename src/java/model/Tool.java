package model;

public class Tool {
    private long id;
    private String name;
    private ToolType type;
    private boolean available;
    private boolean take_return;

    public boolean isTake_return() {
        return take_return;
    }

    public void setTake_return(boolean take_return) {
        this.take_return = take_return;
    }

    public Tool() {
    }

    public Tool(long id, String name, ToolType type, boolean available) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolType getType() {
        return type;
    }

    public void setType(ToolType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

