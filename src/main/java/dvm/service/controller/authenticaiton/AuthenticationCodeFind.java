package dvm.service.controller.authenticaiton;

import dvm.domain.authentication.AuthenticationCodeRepository;

public class AuthenticationCodeFind implements AuthenticationServiceController<Boolean> {

    private AuthenticationCodeRepository authenticationCodeRepository = AuthenticationCodeRepository.getInstance();

    // 실제로 어떤 인증코드인지 인덱스를 구하는 작업 추가해야할 수도 있다.
    @Override
    public Boolean process(String authenticationCode) {
        return authenticationCodeRepository.findAuthenticationCode(authenticationCode);
    }
}
