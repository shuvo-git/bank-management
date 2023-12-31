package com.jobayed.accountservice.service;

import com.jobayed.accountservice.domain.AccountEntity;
import com.jobayed.accountservice.enums.YNEnum;
import com.jobayed.accountservice.ep.model.request.AccountCreateRequest;
import com.jobayed.accountservice.repository.AccountRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    @Transactional
    @KafkaListener(groupId = "testGroup", topics = "test")
    public void createAccount(AccountCreateRequest request) {
        log.info("Received {}", request);
        if (request != null) {
            AccountEntity entity = AccountEntity.builder()
                    .name(request.getName())
                    .phoneNumber(request.getPhoneNumber())
                    .dateOfBirth(request.getDateOfBirth())
                    .status(YNEnum.Y)
                    .build();
            accountRepository.save(entity);
        }
    }
}
