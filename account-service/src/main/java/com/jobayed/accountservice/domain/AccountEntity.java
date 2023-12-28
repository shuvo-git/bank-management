package com.jobayed.accountservice.domain;

import com.jobayed.accountservice.enums.YNEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "ACCOUNT")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_id_generator"
    )
    @SequenceGenerator(
            name = "account_id_generator",
            sequenceName = "account_id_seq",
            allocationSize = 1
    )
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "phone")
    String phoneNumber;

    @Column(name = "dob")
    LocalDateTime dateOfBirth;

    @Enumerated
    @Column(name = "status")
    YNEnum status;
}
