package service;

import dao.ToolDao;
import dao.ToolDaoImpl;
import model.Tool;

import java.util.List;

public class ToolServiceImpl implements ToolService {

    private final ToolDao toolDao = new ToolDaoImpl();

    @Override
    public List<Tool> getAllTools() {
        return toolDao.getAll();
    }

    @Override
    public void setAvailability(boolean isAvailable, long id) {
        toolDao.setAvailability(isAvailable, id);
    }
}
