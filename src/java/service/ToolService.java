package service;

import model.Tool;

import java.util.List;

public interface ToolService {
    List<Tool> getAllTools();
    void setAvailability(boolean isAvailable, long id);
}