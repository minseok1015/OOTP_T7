package dvm;

import dvm.service.controller.AdminPool;
import dvm.service.controller.AuthenticationPool;
import dvm.service.controller.FrontController;
import dvm.service.controller.ItemPool;

public class Main {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        ItemPool itemPool = new ItemPool();
        AuthenticationPool authenticationPool = new AuthenticationPool();
        AdminPool adminPool = new AdminPool();

        frontController.setItemMode(itemPool.getController("CHECK"));
        System.out.println(frontController.getItemServiceController().process(2,6));
        //test Auto build
    }
}
