package dvm.service.controller.authenticaiton;

import dvm.domain.authentication.AuthenticationCodeRepository;

public class AuthenticationCodeSave implements AuthenticationServiceController<Void> {

    private AuthenticationCodeRepository authenticationCodeRepository = AuthenticationCodeRepository.getInstance();

    @Override
    public Void process(String authenticationCode) {
        authenticationCodeRepository.saveAuthenticationCode(authenticationCode);
        return null;
    }
}
