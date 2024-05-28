package dvm.service.controller;

import dvm.service.controller.admin.AdminServiceController;
import dvm.service.controller.admin.SetItemPrice;
import dvm.service.controller.admin.SetItemStock;

import java.util.HashMap;
import java.util.Map;

public class AdminPool {

    private Map<String, AdminServiceController> adminControllerMap = new HashMap<>();

    public AdminPool() {
        adminControllerMap.put("STOCK",new SetItemStock());
        adminControllerMap.put("PRICE",new SetItemPrice());
    }

    public AdminServiceController getController(String type) {
        return adminControllerMap.get(type);
    }
}
