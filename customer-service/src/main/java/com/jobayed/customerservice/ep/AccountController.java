package com.jobayed.customerservice.ep;

import com.jobayed.customerservice.KafkaProducerService;
import com.jobayed.customerservice.ep.model.request.AccountCreateRequest;
import com.jobayed.customerservice.ep.model.response.AccountCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {
    private final KafkaProducerService kafkaProducerService;

    @GetMapping
    public String getHello() {
        return "Hello, welcome ";
    }

    @PostMapping
    public AccountCreateResponse createAccount(@RequestBody AccountCreateRequest accountCreateRequest) {
        String key = "Ac";
        kafkaProducerService.sendToKafka(
                "test",
                key,
                accountCreateRequest
        );
        return AccountCreateResponse.builder()
                .message("Account Successfully created!!")
                .errorCode("000_000")
                .build();
    }
}
