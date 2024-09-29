package hello.controller;

import hello.repository.PLRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
@Slf4j
@Tag(name = "Procedures", description = "Requests invoking stored procedures")
@RequestMapping(path = "/api/procedures", produces = MediaType.APPLICATION_JSON_VALUE)
public class PLController {
    private final PLRepository plRepository;

    @GetMapping("/{text}")
    @Operation(summary = "Returns SAY HELLO TO MY LITTLE + any text from path variable")
    public String sayHello(@PathVariable String text) {
        String output = plRepository.sayHello(text);
        log.info(output);
        return output;
    }

}
