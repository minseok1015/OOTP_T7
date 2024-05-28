package dvm.service.controller;

import dvm.service.controller.item.ItemCheck;
import dvm.service.controller.item.ItemServiceController;
import dvm.service.controller.item.ItemUpdate;

import java.util.HashMap;
import java.util.Map;

public class ItemPool {

    private Map<String, ItemServiceController> itemControllerMap = new HashMap<>();

    public ItemPool() {
        itemControllerMap.put("CHECK",new ItemCheck());
        itemControllerMap.put("UPDATE",new ItemUpdate());
    }

    public ItemServiceController getController(String type) {
        return itemControllerMap.get(type);
    }
}
