package com.jobayed.customerservice.ep.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountCreateRequest implements Serializable {
    String name;
    String phoneNumber;
    LocalDateTime dateOfBirth;
}

