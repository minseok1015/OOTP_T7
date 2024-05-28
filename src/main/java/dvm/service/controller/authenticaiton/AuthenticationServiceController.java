package dvm.service.controller.authenticaiton;

public interface AuthenticationServiceController<T> {

    T process(String authenticationCode);

}
