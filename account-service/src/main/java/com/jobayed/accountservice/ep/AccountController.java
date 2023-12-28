package com.jobayed.accountservice.ep;

import com.jobayed.accountservice.ep.model.request.AccountCreateRequest;
import com.jobayed.accountservice.ep.model.response.AccountCreateResponse;
import com.jobayed.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public String getHello() {
        return "Hello, welcome ";
    }

    @PostMapping
    public AccountCreateResponse createAccount(@RequestBody AccountCreateRequest accountCreateRequest) {
        return accountService.createAccount(accountCreateRequest);
    }
}
