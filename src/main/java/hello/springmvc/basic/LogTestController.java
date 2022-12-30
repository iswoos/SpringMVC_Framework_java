package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        /*
        올바르지 않은 로그 사용법
        log.debug("data="+data)
        로그 출력 레벨을 info로 설정해도 해당 코드에 있는 "data="+data가 실제 실행이 되어 버린다.
        결과적으로 문자 더하기 연산이 발생한다.

        올바른 로그 사용법
        log.debug("data={}", data)
        로그 출력 레벨을 info로 설정하면 아무일도 발생하지 않는다. 따라서 앞과 같은 의미없는 연산이
        발생하지 않는다
        */

        // 레벨이 낮은 순서대로 나열되어있음
        log.trace("trace log={}", name);
        log.debug("trace log={}", name);
        log.info("info log={}", name);
        log.warn("trace log={}", name);
        log.error("trace log={}", name);

        return "ok";
    }
}
