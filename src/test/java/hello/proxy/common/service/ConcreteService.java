package hello.proxy.common.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bumblebee
 */
@Slf4j
public class ConcreteService {

    public void call() {
        log.info("ConcreateSerive 호출");
    }

}
