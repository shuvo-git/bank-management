package com.jobayed.accountservice.service;

import com.jobayed.accountservice.ep.model.request.AccountCreateRequest;

public interface AccountService {
    void createAccount(AccountCreateRequest request);
}
