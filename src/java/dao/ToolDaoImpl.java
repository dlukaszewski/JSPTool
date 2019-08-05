package dao;

import model.Tool;
import model.ToolType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolDaoImpl implements ToolDao {
    @Override
    public List<Tool> getAll() {


        Tool tool1 = new Tool(1, "Sonic scredriver", ToolType.SCREWDRIVER, true);
        Tool tool2 = new Tool(2, "Wiertarka", ToolType.OTHER, false);
        Tool tool3 = new Tool(3, "Pila", ToolType.SAW, true);
        Tool tool4 = new Tool(4, "Mlotek", ToolType.HAMMER, true);


        List<Tool> list = new ArrayList<>();
        return Arrays.asList(tool1, tool2, tool3, tool4);
    }
}
