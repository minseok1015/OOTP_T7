package dvm.service.controller;

import dvm.service.controller.authenticaiton.AuthenticationCodeFind;
import dvm.service.controller.authenticaiton.AuthenticationCodeSave;
import dvm.service.controller.authenticaiton.AuthenticationServiceController;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationPool {

    private Map<String, AuthenticationServiceController> authenticationControllerMap = new HashMap<>();

    public AuthenticationPool() {
        authenticationControllerMap.put("SAVE",new AuthenticationCodeSave());
        authenticationControllerMap.put("FIND",new AuthenticationCodeFind());
    }

    public AuthenticationServiceController getController(String type) {
        return authenticationControllerMap.get(type);
    }
}
