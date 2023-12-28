package com.jobayed.accountservice.service;

import com.jobayed.accountservice.ep.model.request.AccountCreateRequest;
import com.jobayed.accountservice.ep.model.response.AccountCreateResponse;

public interface AccountService {
    AccountCreateResponse createAccount(AccountCreateRequest request);
}
