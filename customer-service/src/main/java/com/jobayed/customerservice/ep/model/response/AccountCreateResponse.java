package com.jobayed.customerservice.ep.model.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AccountCreateResponse {
    String errorCode;
    String message;
}
